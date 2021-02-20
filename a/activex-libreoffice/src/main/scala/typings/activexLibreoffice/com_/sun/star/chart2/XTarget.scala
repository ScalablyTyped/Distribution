package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XTarget extends XInterface {
  
  def addDrawElement(): Unit = js.native
}
object XTarget {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addDrawElement: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTarget = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addDrawElement = js.Any.fromFunction0(addDrawElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTarget]
  }
  
  @scala.inline
  implicit class XTargetMutableBuilder[Self <: XTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddDrawElement(value: () => Unit): Self = StObject.set(x, "addDrawElement", js.Any.fromFunction0(value))
  }
}
