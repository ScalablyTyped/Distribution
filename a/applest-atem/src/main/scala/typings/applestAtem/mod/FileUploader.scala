package typings.applestAtem.mod

import typings.node.bufferMod.global.Buffer
import typings.pngjs.mod.PNG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("applest-atem", "FileUploader")
@js.native
open class FileUploader protected () extends StObject {
  def this(atem: ATEM) = this()
  
  def convertPNGToYUV422(width: Double, height: Double, data: js.Array[Double]): Buffer = js.native
  
  def uploadFromPNGBuffer(pngBuffer: Buffer): PNG = js.native
  def uploadFromPNGBuffer(pngBuffer: Buffer, bankIndex: Double): PNG = js.native
  def uploadFromPNGBuffer(pngBuffer: Buffer, bankIndex: Double, frameIndex: Double): PNG = js.native
  def uploadFromPNGBuffer(pngBuffer: Buffer, bankIndex: Unit, frameIndex: Double): PNG = js.native
  
  def uploadFromPNGFile(path: String): Unit = js.native
}
