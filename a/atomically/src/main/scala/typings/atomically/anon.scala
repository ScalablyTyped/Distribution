package typings.atomically

import typings.atomically.atomicallyBooleans.`false`
import typings.node.NodeJS.ArrayBufferView
import typings.node.anon.EncodingFlag
import typings.node.anon.Flag
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.ObjectEncodingOptionsflagEncoding
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.EncodingOption
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import typings.node.fsMod.PathOrFileDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait FnCallFdBufferOffsetLengthPosition extends StObject {
    
    def apply(fd: Double, buffer: ArrayBufferView): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Unit, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Unit, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Null, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Unit, position: Double): Double = js.native
    def apply(fd: Double, string: String): Double = js.native
    def apply(fd: Double, string: String, position: Double): Double = js.native
    def apply(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = js.native
    def apply(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = js.native
    def apply(fd: Double, string: String, position: Unit, encoding: BufferEncoding): Double = js.native
  }
  
  @js.native
  trait FnCallPathFlagsMode extends StObject {
    
    def apply(path: PathLike, flags: OpenMode): Double = js.native
    def apply(path: PathLike, flags: OpenMode, mode: Mode): Double = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends StObject {
    
    def apply(path: PathOrFileDescriptor): String | Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: EncodingFlag): String = js.native
    def apply(path: PathOrFileDescriptor, options: Flag): Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): String | Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: BufferEncoding): String = js.native
  }
  
  trait Gid extends StObject {
    
    var gid: Double
    
    var uid: Double
  }
  object Gid {
    
    inline def apply(gid: Double, uid: Double): Gid = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gid]
    }
    
    extension [Self <: Gid](x: Self) {
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined atomically.atomically/dist/types.ReadOptions & {  encoding :string} */
  trait ReadOptionsencodingstring extends StObject {
    
    var encoding: (js.UndefOr[String | Null]) & String
    
    var mode: js.UndefOr[String | Double | `false`] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ReadOptionsencodingstring {
    
    inline def apply(encoding: (js.UndefOr[String | Null]) & String): ReadOptionsencodingstring = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadOptionsencodingstring]
    }
    
    extension [Self <: ReadOptionsencodingstring](x: Self) {
      
      inline def setEncoding(value: (js.UndefOr[String | Null]) & String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setMode(value: String | Double | `false`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
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
}
