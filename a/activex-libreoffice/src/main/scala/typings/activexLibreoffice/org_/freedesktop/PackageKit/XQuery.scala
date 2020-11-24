package typings.activexLibreoffice.org_.freedesktop.PackageKit

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface used for quering the package database.
  * @see https://git.gnome.org/browse/gnome-software/tree/src/org.freedesktop.PackageKit.xml for documentation of the corresponding D-Bus interface
  */
@js.native
trait XQuery extends XInterface {
  
  /**
    * Installs local package files or service packs.
    * @since LibreOffice 4.0
    */
  def IsInstalled(packageName: String, interaction: String, installed: js.Array[Boolean]): Unit = js.native
  
  /**
    * Installs packages to provide files.
    * @since LibreOffice 4.0
    */
  def SearchFile(fileName: String, interaction: String, installed: js.Array[Boolean], packageName: js.Array[String]): Unit = js.native
}
object XQuery {
  
  @scala.inline
  def apply(
    IsInstalled: (String, String, js.Array[Boolean]) => Unit,
    SearchFile: (String, String, js.Array[Boolean], js.Array[String]) => Unit,
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XQuery = {
    val __obj = js.Dynamic.literal(IsInstalled = js.Any.fromFunction3(IsInstalled), SearchFile = js.Any.fromFunction4(SearchFile), acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XQuery]
  }
  
  @scala.inline
  implicit class XQueryOps[Self <: XQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsInstalled(value: (String, String, js.Array[Boolean]) => Unit): Self = this.set("IsInstalled", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSearchFile(value: (String, String, js.Array[Boolean], js.Array[String]) => Unit): Self = this.set("SearchFile", js.Any.fromFunction4(value))
  }
}
