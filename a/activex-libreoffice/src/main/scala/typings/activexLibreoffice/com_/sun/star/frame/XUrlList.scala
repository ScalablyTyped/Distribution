package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
@js.native
trait XUrlList extends XInterface {
  
  var List: SafeArray[String] = js.native
}
object XUrlList {
  
  @scala.inline
  def apply(
    List: SafeArray[String],
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XUrlList = {
    val __obj = js.Dynamic.literal(List = List.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XUrlList]
  }
  
  @scala.inline
  implicit class XUrlListMutableBuilder[Self <: XUrlList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setList(value: SafeArray[String]): Self = StObject.set(x, "List", value.asInstanceOf[js.Any])
  }
}
