package typings.athenajs.mod

import typings.athenajs.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawableOptions extends StObject {
  
  var behavior: js.UndefOr[Instantiable] = js.undefined
  
  var canCollide: js.UndefOr[Boolean] = js.undefined
  
  var canCollideFriendBullet: js.UndefOr[Boolean] = js.undefined
  
  var collideGroup: js.UndefOr[Double] = js.undefined
  
  var layer: js.UndefOr[Double] = js.undefined
  
  var map: js.UndefOr[Map] = js.undefined
  
  var objectId: js.UndefOr[String] = js.undefined
  
  var pool: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object DrawableOptions {
  
  inline def apply(): DrawableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawableOptions]
  }
  
  extension [Self <: DrawableOptions](x: Self) {
    
    inline def setBehavior(value: Instantiable): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    inline def setCanCollide(value: Boolean): Self = StObject.set(x, "canCollide", value.asInstanceOf[js.Any])
    
    inline def setCanCollideFriendBullet(value: Boolean): Self = StObject.set(x, "canCollideFriendBullet", value.asInstanceOf[js.Any])
    
    inline def setCanCollideFriendBulletUndefined: Self = StObject.set(x, "canCollideFriendBullet", js.undefined)
    
    inline def setCanCollideUndefined: Self = StObject.set(x, "canCollide", js.undefined)
    
    inline def setCollideGroup(value: Double): Self = StObject.set(x, "collideGroup", value.asInstanceOf[js.Any])
    
    inline def setCollideGroupUndefined: Self = StObject.set(x, "collideGroup", js.undefined)
    
    inline def setLayer(value: Double): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setPool(value: Double): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
