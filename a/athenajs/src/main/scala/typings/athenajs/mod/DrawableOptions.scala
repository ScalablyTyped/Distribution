package typings.athenajs.mod

import typings.athenajs.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawableOptions extends js.Object {
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
  implicit class DrawableOptionsOps[Self <: DrawableOptions] (val x: Self) extends AnyVal {
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
    def setBehavior(value: Instantiable): Self = this.set("behavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehavior: Self = this.set("behavior", js.undefined)
    @scala.inline
    def setCanCollide(value: Boolean): Self = this.set("canCollide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanCollide: Self = this.set("canCollide", js.undefined)
    @scala.inline
    def setCanCollideFriendBullet(value: Boolean): Self = this.set("canCollideFriendBullet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanCollideFriendBullet: Self = this.set("canCollideFriendBullet", js.undefined)
    @scala.inline
    def setCollideGroup(value: Double): Self = this.set("collideGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollideGroup: Self = this.set("collideGroup", js.undefined)
    @scala.inline
    def setLayer(value: Double): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    @scala.inline
    def setMap(value: Map): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setPool(value: Double): Self = this.set("pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

