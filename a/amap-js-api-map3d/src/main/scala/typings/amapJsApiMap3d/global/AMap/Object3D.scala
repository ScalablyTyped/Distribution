package typings.amapJsApiMap3d.global.AMap

import typings.amapJsApiMap3d.AMap.Object3D.MeshLine.Options
import typings.amapJsApiMap3d.anon.MeshreadonlyvertexNormals
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Object3D")
@js.native
class Object3D ()
  extends typings.amapJsApiMap3d.AMap.Object3D {
  /* CompleteClass */
  override var DEPTH_TEST: Boolean = js.native
  /* CompleteClass */
  override val geometry: typings.amapJsApiMap3d.AMap.Geometry3D = js.native
  /* CompleteClass */
  override var needUpdate: Boolean = js.native
  /* CompleteClass */
  override var textures: js.Array[String | HTMLCanvasElement] = js.native
  /* CompleteClass */
  override var transparent: Boolean = js.native
  /* CompleteClass */
  override def reDraw(): Unit = js.native
  // internal
  /* CompleteClass */
  override def reset(): Unit = js.native
}

@JSGlobal("AMap.Object3D")
@js.native
object Object3D extends js.Object {
  @js.native
  class Line ()
    extends typings.amapJsApiMap3d.AMap.Object3D.Line {
    /* CompleteClass */
    override var DEPTH_TEST: Boolean = js.native
    /* CompleteClass */
    override val geometry: typings.amapJsApiMap3d.AMap.Geometry3D = js.native
    /* CompleteClass */
    @JSName("geometry")
    override val geometry_Line: typings.amapJsApiMap3d.AMap.Geometry3D.Line = js.native
    /* CompleteClass */
    override var needUpdate: Boolean = js.native
    /* CompleteClass */
    override var textures: js.Array[String | HTMLCanvasElement] = js.native
    /* CompleteClass */
    override var transparent: Boolean = js.native
    /* CompleteClass */
    override def reDraw(): Unit = js.native
    // internal
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  @js.native
  class Mesh ()
    extends typings.amapJsApiMap3d.AMap.Object3D.Mesh {
    /* CompleteClass */
    override var DEPTH_TEST: Boolean = js.native
    /* CompleteClass */
    override val geometry: typings.amapJsApiMap3d.AMap.Geometry3D = js.native
    /* CompleteClass */
    @JSName("geometry")
    override val geometry_Mesh: typings.amapJsApiMap3d.AMap.Geometry3D.Mesh = js.native
    /* CompleteClass */
    override var needUpdate: Boolean = js.native
    /* CompleteClass */
    override var textures: js.Array[String | HTMLCanvasElement] = js.native
    /* CompleteClass */
    override var transparent: Boolean = js.native
    /* CompleteClass */
    override def reDraw(): Unit = js.native
    // internal
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  @js.native
  class MeshAcceptLights ()
    extends typings.amapJsApiMap3d.AMap.Object3D.MeshAcceptLights {
    /* CompleteClass */
    override var DEPTH_TEST: Boolean = js.native
    /* CompleteClass */
    override val geometry: typings.amapJsApiMap3d.AMap.Geometry3D = js.native
    /* CompleteClass */
    @JSName("geometry")
    override val geometry_Mesh: typings.amapJsApiMap3d.AMap.Geometry3D.Mesh = js.native
    /* CompleteClass */
    @JSName("geometry")
    override val geometry_MeshAcceptLights: MeshreadonlyvertexNormals = js.native
    /* CompleteClass */
    override var needUpdate: Boolean = js.native
    /* CompleteClass */
    override var textures: js.Array[String | HTMLCanvasElement] = js.native
    /* CompleteClass */
    override var transparent: Boolean = js.native
    /* CompleteClass */
    override def reDraw(): Unit = js.native
    // internal
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  // inherit from WideLine
  @js.native
  class MeshLine protected ()
    extends typings.amapJsApiMap3d.AMap.Object3D.MeshLine {
    def this(options: Options) = this()
    /* CompleteClass */
    override var DEPTH_TEST: Boolean = js.native
    /* CompleteClass */
    override val geometry: typings.amapJsApiMap3d.AMap.Geometry3D = js.native
    /* CompleteClass */
    override var needUpdate: Boolean = js.native
    /* CompleteClass */
    override var textures: js.Array[String | HTMLCanvasElement] = js.native
    /* CompleteClass */
    override var transparent: Boolean = js.native
    /* CompleteClass */
    override def reDraw(): Unit = js.native
    // internal
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  @js.native
  class Points ()
    extends typings.amapJsApiMap3d.AMap.Object3D.Points {
    /* CompleteClass */
    override var DEPTH_TEST: Boolean = js.native
    /* CompleteClass */
    override var borderColor: String = js.native
    /* CompleteClass */
    override var borderWeight: Double = js.native
    /* CompleteClass */
    override val geometry: typings.amapJsApiMap3d.AMap.Geometry3D = js.native
    /* CompleteClass */
    @JSName("geometry")
    override val geometry_Points: typings.amapJsApiMap3d.AMap.Geometry3D.Points = js.native
    /* CompleteClass */
    override var needUpdate: Boolean = js.native
    /* CompleteClass */
    override var textures: js.Array[String | HTMLCanvasElement] = js.native
    /* CompleteClass */
    override var transparent: Boolean = js.native
    /* CompleteClass */
    override def reDraw(): Unit = js.native
    // internal
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  @js.native
  class Prism protected ()
    extends typings.amapJsApiMap3d.AMap.Object3D.MeshAcceptLights {
    def this(options: typings.amapJsApiMap3d.AMap.Object3D.Prism.Options) = this()
    /* CompleteClass */
    override var DEPTH_TEST: Boolean = js.native
    /* CompleteClass */
    override val geometry: typings.amapJsApiMap3d.AMap.Geometry3D = js.native
    /* CompleteClass */
    @JSName("geometry")
    override val geometry_Mesh: typings.amapJsApiMap3d.AMap.Geometry3D.Mesh = js.native
    /* CompleteClass */
    @JSName("geometry")
    override val geometry_MeshAcceptLights: MeshreadonlyvertexNormals = js.native
    /* CompleteClass */
    override var needUpdate: Boolean = js.native
    /* CompleteClass */
    override var textures: js.Array[String | HTMLCanvasElement] = js.native
    /* CompleteClass */
    override var transparent: Boolean = js.native
    /* CompleteClass */
    override def reDraw(): Unit = js.native
    // internal
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  @js.native
  class RoundPoints ()
    extends typings.amapJsApiMap3d.AMap.Object3D.RoundPoints {
    /* CompleteClass */
    override var DEPTH_TEST: Boolean = js.native
    /* CompleteClass */
    override var borderColor: String = js.native
    /* CompleteClass */
    override var borderWeight: Double = js.native
    /* CompleteClass */
    override val geometry: typings.amapJsApiMap3d.AMap.Geometry3D = js.native
    /* CompleteClass */
    @JSName("geometry")
    override val geometry_Points: typings.amapJsApiMap3d.AMap.Geometry3D.Points = js.native
    /* CompleteClass */
    override var merge: Boolean = js.native
    /* CompleteClass */
    override var needUpdate: Boolean = js.native
    /* CompleteClass */
    override var textures: js.Array[String | HTMLCanvasElement] = js.native
    /* CompleteClass */
    override var transparent: Boolean = js.native
    /* CompleteClass */
    override def reDraw(): Unit = js.native
    // internal
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  @js.native
  class ThinLine protected ()
    extends typings.amapJsApiMap3d.AMap.Object3D.Line {
    def this(options: typings.amapJsApiMap3d.AMap.Object3D.ThinLine.Options) = this()
    /* CompleteClass */
    override var DEPTH_TEST: Boolean = js.native
    /* CompleteClass */
    override val geometry: typings.amapJsApiMap3d.AMap.Geometry3D = js.native
    /* CompleteClass */
    @JSName("geometry")
    override val geometry_Line: typings.amapJsApiMap3d.AMap.Geometry3D.Line = js.native
    /* CompleteClass */
    override var needUpdate: Boolean = js.native
    /* CompleteClass */
    override var textures: js.Array[String | HTMLCanvasElement] = js.native
    /* CompleteClass */
    override var transparent: Boolean = js.native
    /* CompleteClass */
    override def reDraw(): Unit = js.native
    // internal
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
  // tslint:disable-next-line
  @js.native
  class Wall ()
    extends typings.amapJsApiMap3d.AMap.Object3D.MeshAcceptLights {
    /* CompleteClass */
    override var DEPTH_TEST: Boolean = js.native
    /* CompleteClass */
    override val geometry: typings.amapJsApiMap3d.AMap.Geometry3D = js.native
    /* CompleteClass */
    @JSName("geometry")
    override val geometry_Mesh: typings.amapJsApiMap3d.AMap.Geometry3D.Mesh = js.native
    /* CompleteClass */
    @JSName("geometry")
    override val geometry_MeshAcceptLights: MeshreadonlyvertexNormals = js.native
    /* CompleteClass */
    override var needUpdate: Boolean = js.native
    /* CompleteClass */
    override var textures: js.Array[String | HTMLCanvasElement] = js.native
    /* CompleteClass */
    override var transparent: Boolean = js.native
    /* CompleteClass */
    override def reDraw(): Unit = js.native
    // internal
    /* CompleteClass */
    override def reset(): Unit = js.native
  }
  
}

