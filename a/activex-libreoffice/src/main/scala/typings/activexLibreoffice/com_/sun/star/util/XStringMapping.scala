package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a mapping from `string` to `string` */
@js.native
trait XStringMapping extends XInterface {
  
  /** provides a mapping for a given sequence of strings to a sequence of belonging strings. */
  def mapStrings(Parameter: js.Array[SeqEquiv[String]]): Boolean = js.native
}
object XStringMapping {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    mapStrings: js.Array[SeqEquiv[String]] => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStringMapping = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), mapStrings = js.Any.fromFunction1(mapStrings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStringMapping]
  }
  
  @scala.inline
  implicit class XStringMappingOps[Self <: XStringMapping] (val x: Self) extends AnyVal {
    
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
    def setMapStrings(value: js.Array[SeqEquiv[String]] => Boolean): Self = this.set("mapStrings", js.Any.fromFunction1(value))
  }
}
