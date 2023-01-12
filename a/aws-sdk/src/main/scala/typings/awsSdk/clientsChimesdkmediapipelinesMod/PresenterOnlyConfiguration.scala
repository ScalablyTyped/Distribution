package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresenterOnlyConfiguration extends StObject {
  
  /**
    * Defines the position of the presenter video tile. Default: TopRight.
    */
  var PresenterPosition: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.PresenterPosition] = js.undefined
}
object PresenterOnlyConfiguration {
  
  inline def apply(): PresenterOnlyConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresenterOnlyConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PresenterOnlyConfiguration] (val x: Self) extends AnyVal {
    
    inline def setPresenterPosition(value: PresenterPosition): Self = StObject.set(x, "PresenterPosition", value.asInstanceOf[js.Any])
    
    inline def setPresenterPositionUndefined: Self = StObject.set(x, "PresenterPosition", js.undefined)
  }
}
