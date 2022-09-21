package typings.aframe.mod.THREE

import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.Audio")
@js.native
open class Audio[NodeType /* <: AudioNode */] protected ()
  extends typings.three.mod.Audio[NodeType] {
  def this(listener: typings.three.audioListenerMod.AudioListener) = this()
}
