package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destination extends StObject {
  
  var destination: js.UndefOr[LngLat] = js.native
  
  var destinationName: js.UndefOr[String] = js.native
  
  var origin: js.UndefOr[LngLat] = js.native
  
  var originName: js.UndefOr[String] = js.native
}
object Destination {
  
  @scala.inline
  def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: LngLat): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationName(value: String): Self = StObject.set(x, "destinationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNameUndefined: Self = StObject.set(x, "destinationName", js.undefined)
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setOrigin(value: LngLat): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginName(value: String): Self = StObject.set(x, "originName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginNameUndefined: Self = StObject.set(x, "originName", js.undefined)
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
