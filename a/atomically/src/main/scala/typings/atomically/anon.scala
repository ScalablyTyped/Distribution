package typings.atomically

import typings.atomically.atomicallyBooleans.`false`
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ArrayBufferView
import typings.node.anon.BaseEncodingOptionsflagst
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.`3`
import typings.node.fsMod.BaseEncodingOptions
import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply(path: Double): String | Buffer = js.native
    def apply(path: Double, options: BufferEncoding): String = js.native
    def apply(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def apply(path: Double, options: EncodingBufferEncoding): String = js.native
    def apply(path: Double, options: `3`): Buffer = js.native
    def apply(path: PathLike): String | Buffer = js.native
    def apply(path: PathLike, options: BufferEncoding): String = js.native
    def apply(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def apply(path: PathLike, options: EncodingBufferEncoding): String = js.native
    def apply(path: PathLike, options: `3`): Buffer = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait FnCallFdBufferOffsetLengthPosition extends StObject {
    
    def apply(fd: Double, buffer: ArrayBufferView): Double = js.native
    def apply(
      fd: Double,
      buffer: ArrayBufferView,
      offset: js.UndefOr[scala.Nothing],
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: js.UndefOr[scala.Nothing], length: Double): Double = js.native
    def apply(
      fd: Double,
      buffer: ArrayBufferView,
      offset: js.UndefOr[scala.Nothing],
      length: Double,
      position: Double
    ): Double = js.native
    def apply(
      fd: Double,
      buffer: ArrayBufferView,
      offset: js.UndefOr[scala.Nothing],
      length: Null,
      position: Double
    ): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double): Double = js.native
    def apply(
      fd: Double,
      buffer: ArrayBufferView,
      offset: Double,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = js.native
    def apply(
      fd: Double,
      buffer: ArrayBufferView,
      offset: Null,
      length: js.UndefOr[scala.Nothing],
      position: Double
    ): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = js.native
    def apply(fd: Double, string: String): Double = js.native
    def apply(fd: Double, string: String, position: js.UndefOr[scala.Nothing], encoding: BufferEncoding): Double = js.native
    def apply(fd: Double, string: String, position: Double): Double = js.native
    def apply(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = js.native
    def apply(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = js.native
  }
  
  @js.native
  trait FnCallPathFlagsMode extends StObject {
    
    def apply(path: PathLike, flags: OpenMode): Double = js.native
    def apply(path: PathLike, flags: OpenMode, mode: Mode): Double = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends StObject {
    
    def apply(path: PathLike): Stats = js.native
    def apply(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    def apply(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
  }
  
  @js.native
  trait Gid extends StObject {
    
    var gid: Double = js.native
    
    var uid: Double = js.native
  }
  object Gid {
    
    @scala.inline
    def apply(gid: Double, uid: Double): Gid = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gid]
    }
    
    @scala.inline
    implicit class GidMutableBuilder[Self <: Gid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined atomically.atomically/dist/types.ReadOptions & {  encoding :string} */
  @js.native
  trait ReadOptionsencodingstring extends StObject {
    
    var encoding: (js.UndefOr[String | Null]) with String = js.native
    
    var mode: js.UndefOr[String | Double | `false`] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object ReadOptionsencodingstring {
    
    @scala.inline
    def apply(encoding: (js.UndefOr[String | Null]) with String): ReadOptionsencodingstring = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadOptionsencodingstring]
    }
    
    @scala.inline
    implicit class ReadOptionsencodingstringMutableBuilder[Self <: ReadOptionsencodingstring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: (js.UndefOr[String | Null]) with String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: String | Double | `false`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait TypeofrealpathSync extends StObject {
    
    def apply(path: PathLike): String = js.native
    def apply(path: PathLike, options: String): String | Buffer = js.native
    def apply(path: PathLike, options: BufferEncoding): String = js.native
    def apply(path: PathLike, options: BaseEncodingOptions): String = js.native
    def apply(path: PathLike, options: BufferEncodingOption): Buffer = js.native
    
    def native(path: PathLike): String = js.native
    def native(path: PathLike, options: String): String | Buffer = js.native
    def native(path: PathLike, options: BufferEncoding): String = js.native
    def native(path: PathLike, options: BaseEncodingOptions): String = js.native
    def native(path: PathLike, options: BufferEncodingOption): Buffer = js.native
    @JSName("native")
    def native_Union(path: PathLike): String | Buffer = js.native
    @JSName("native")
    def native_Union(path: PathLike, options: BaseEncodingOptions): String | Buffer = js.native
  }
}
