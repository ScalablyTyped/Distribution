package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnChanges extends StObject {
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  def ngOnChanges(changes: SimpleChanges): Unit = js.native
}
object OnChanges {
  
  @scala.inline
  def apply(ngOnChanges: SimpleChanges => Unit): OnChanges = {
    val __obj = js.Dynamic.literal(ngOnChanges = js.Any.fromFunction1(ngOnChanges))
    __obj.asInstanceOf[OnChanges]
  }
  
  @scala.inline
  implicit class OnChangesMutableBuilder[Self <: OnChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNgOnChanges(value: SimpleChanges => Unit): Self = StObject.set(x, "ngOnChanges", js.Any.fromFunction1(value))
  }
}
