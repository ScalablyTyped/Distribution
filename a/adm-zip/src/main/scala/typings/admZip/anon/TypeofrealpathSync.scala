package typings.admZip.anon

import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.EncodingOption
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofrealpathSync extends StObject {
  
  def apply(path: PathLike): String = js.native
  def apply(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  def apply(path: PathLike, options: EncodingOption): String = js.native
  
  def native(path: PathLike): String = js.native
  def native(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  def native(path: PathLike, options: EncodingOption): String = js.native
  @JSName("native")
  def native_Union(path: PathLike): String | Buffer = js.native
  @JSName("native")
  def native_Union(path: PathLike, options: EncodingOption): String | Buffer = js.native
}
