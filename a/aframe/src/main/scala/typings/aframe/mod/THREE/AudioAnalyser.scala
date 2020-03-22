package typings.aframe.mod.THREE

import typings.std.AudioNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "THREE.AudioAnalyser")
@js.native
class AudioAnalyser protected ()
  extends typings.three.mod.AudioAnalyser {
  def this(audio: typings.three.audioMod.Audio[AudioNode], fftSize: Double) = this()
}

