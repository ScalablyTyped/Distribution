package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayersListItem extends StObject {
  
  /**
    * The newest version of the layer.
    */
  var LatestMatchingVersion: js.UndefOr[LayerVersionsListItem] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var LayerArn: js.UndefOr[typings.awsSdk.clientsLambdaMod.LayerArn] = js.undefined
  
  /**
    * The name of the layer.
    */
  var LayerName: js.UndefOr[typings.awsSdk.clientsLambdaMod.LayerName] = js.undefined
}
object LayersListItem {
  
  inline def apply(): LayersListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayersListItem] (val x: Self) extends AnyVal {
    
    inline def setLatestMatchingVersion(value: LayerVersionsListItem): Self = StObject.set(x, "LatestMatchingVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestMatchingVersionUndefined: Self = StObject.set(x, "LatestMatchingVersion", js.undefined)
    
    inline def setLayerArn(value: LayerArn): Self = StObject.set(x, "LayerArn", value.asInstanceOf[js.Any])
    
    inline def setLayerArnUndefined: Self = StObject.set(x, "LayerArn", js.undefined)
    
    inline def setLayerName(value: LayerName): Self = StObject.set(x, "LayerName", value.asInstanceOf[js.Any])
    
    inline def setLayerNameUndefined: Self = StObject.set(x, "LayerName", js.undefined)
  }
}
