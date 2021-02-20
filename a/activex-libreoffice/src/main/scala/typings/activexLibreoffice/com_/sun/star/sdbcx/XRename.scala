package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supports the renaming of definition objects. ;
  *
  * This is a very desirable feature which is not supported by all databases. There is no standard SQL statement provided for this feature.
  */
@js.native
trait XRename extends XInterface {
  
  /**
    * is intended to alter the name of a object.
    * @param newName the new name
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def rename(newName: String): Unit = js.native
}
object XRename {
  
  @scala.inline
  def apply(acquire: () => Unit, queryInterface: `type` => js.Any, release: () => Unit, rename: String => Unit): XRename = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), rename = js.Any.fromFunction1(rename))
    __obj.asInstanceOf[XRename]
  }
  
  @scala.inline
  implicit class XRenameMutableBuilder[Self <: XRename] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRename(value: String => Unit): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
  }
}
