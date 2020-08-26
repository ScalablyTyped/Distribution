package typings.amapJsApiMap3d.global.AMap

import typings.amapJsApiMap3d.AMap.Object3D.MeshLine.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Object3D")
@js.native
class Object3D ()
  extends typings.amapJsApiMap3d.AMap.Object3D

@JSGlobal("AMap.Object3D")
@js.native
object Object3D extends js.Object {
  @js.native
  class Line ()
    extends typings.amapJsApiMap3d.AMap.Object3D.Line
  
  @js.native
  class Mesh ()
    extends typings.amapJsApiMap3d.AMap.Object3D.Mesh
  
  @js.native
  class MeshAcceptLights ()
    extends typings.amapJsApiMap3d.AMap.Object3D.MeshAcceptLights
  
  // inherit from WideLine
  @js.native
  class MeshLine protected ()
    extends typings.amapJsApiMap3d.AMap.Object3D.MeshLine {
    def this(options: Options) = this()
  }
  
  @js.native
  class Points ()
    extends typings.amapJsApiMap3d.AMap.Object3D.Points
  
  @js.native
  class Prism protected ()
    extends typings.amapJsApiMap3d.AMap.Object3D.MeshAcceptLights {
    def this(options: typings.amapJsApiMap3d.AMap.Object3D.Prism.Options) = this()
  }
  
  @js.native
  class RoundPoints ()
    extends typings.amapJsApiMap3d.AMap.Object3D.RoundPoints
  
  @js.native
  class ThinLine protected ()
    extends typings.amapJsApiMap3d.AMap.Object3D.Line {
    def this(options: typings.amapJsApiMap3d.AMap.Object3D.ThinLine.Options) = this()
  }
  
  // tslint:disable-next-line
  @js.native
  class Wall ()
    extends typings.amapJsApiMap3d.AMap.Object3D.MeshAcceptLights
  
}

