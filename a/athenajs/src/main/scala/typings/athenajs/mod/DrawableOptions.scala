package typings.athenajs.mod

import typings.athenajs.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawableOptions extends StObject {
  
  var behavior: js.UndefOr[Instantiable] = js.native
  
  var canCollide: js.UndefOr[Boolean] = js.native
  
  var canCollideFriendBullet: js.UndefOr[Boolean] = js.native
  
  var collideGroup: js.UndefOr[Double] = js.native
  
  var layer: js.UndefOr[Double] = js.native
  
  var map: js.UndefOr[Map] = js.native
  
  var objectId: js.UndefOr[String] = js.native
  
  var pool: js.UndefOr[Double] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object DrawableOptions {
  
  @scala.inline
  def apply(): DrawableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawableOptions]
  }
  
  @scala.inline
  implicit class DrawableOptionsMutableBuilder[Self <: DrawableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehavior(value: Instantiable): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
    
    @scala.inline
    def setCanCollide(value: Boolean): Self = StObject.set(x, "canCollide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCollideFriendBullet(value: Boolean): Self = StObject.set(x, "canCollideFriendBullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCollideFriendBulletUndefined: Self = StObject.set(x, "canCollideFriendBullet", js.undefined)
    
    @scala.inline
    def setCanCollideUndefined: Self = StObject.set(x, "canCollide", js.undefined)
    
    @scala.inline
    def setCollideGroup(value: Double): Self = StObject.set(x, "collideGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollideGroupUndefined: Self = StObject.set(x, "collideGroup", js.undefined)
    
    @scala.inline
    def setLayer(value: Double): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setMap(value: Map): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setPool(value: Double): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
