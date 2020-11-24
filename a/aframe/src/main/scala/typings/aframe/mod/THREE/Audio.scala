package typings.aframe.mod.THREE

import typings.std.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aframe", "THREE.Audio")
@js.native
class Audio[NodeType /* <: AudioNode */] protected ()
  extends typings.three.mod.Audio[NodeType] {
  def this(listener: typings.three.audioListenerMod.AudioListener) = this()
}
