package typings.aframe.mod.global.AFRAME.THREE

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.AudioAnalyser")
@js.native
open class AudioAnalyser protected ()
  extends typings.three.mod.AudioAnalyser {
  /**
    * Create a new {@link {@link AudioAnalyser} | AudioAnalyser}.
    * @param audio
    * @param fftSize See {@link https://developer.mozilla.org/en-US/docs/Web/API/AnalyserNode/fftSize | AnalyserNode.fftSize }. Expects a `unsigned integer`. Default `2048`.
    */
  def this(audio: typings.three.srcAudioAudioMod.Audio[AudioNode]) = this()
}
