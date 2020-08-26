package typings.athenajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneOptions extends js.Object {
  var hudScene: js.UndefOr[Scene] = js.native
  var layers: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var resources: js.UndefOr[js.Array[Res]] = js.native
}

object SceneOptions {
  @scala.inline
  def apply(): SceneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneOptions]
  }
  @scala.inline
  implicit class SceneOptionsOps[Self <: SceneOptions] (val x: Self) extends AnyVal {
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
    def setHudScene(value: Scene): Self = this.set("hudScene", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHudScene: Self = this.set("hudScene", js.undefined)
    @scala.inline
    def setLayers(value: Double): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: Res*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[Res]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
  
}

