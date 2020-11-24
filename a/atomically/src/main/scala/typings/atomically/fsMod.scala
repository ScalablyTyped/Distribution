package typings.atomically

import typings.atomically.anon.Fn0
import typings.atomically.anon.FnCall
import typings.atomically.anon.FnCallFdBufferOffsetLengthPosition
import typings.atomically.anon.FnCallPathFlagsMode
import typings.atomically.anon.FnCallPathOptions
import typings.atomically.anon.TypeofrealpathSync
import typings.atomically.typesMod.FN
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.fsMod.BigIntOptions
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatOptions
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("atomically/dist/utils/fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    var chmodAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chmod.__promisify__ */ js.Any = js.native
    
    def chmodSyncAttempt(path: PathLike, mode: Mode): Unit = js.native
    @JSName("chmodSyncAttempt")
    var chmodSyncAttempt_Original: js.Function2[/* path */ PathLike, /* mode */ Mode, Unit] = js.native
    
    var chownAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chown.__promisify__ */ js.Any = js.native
    
    def chownSyncAttempt(path: PathLike, uid: Double, gid: Double): Unit = js.native
    @JSName("chownSyncAttempt")
    var chownSyncAttempt_Original: js.Function3[/* path */ PathLike, /* uid */ Double, /* gid */ Double, Unit] = js.native
    
    var closeAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ js.Any = js.native
    
    def closeRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @JSName("closeRetry")
    var closeRetry_Original: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ _
      ] = js.native
    
    def closeSyncAttempt(fd: Double): Unit = js.native
    @JSName("closeSyncAttempt")
    var closeSyncAttempt_Original: js.Function1[/* fd */ Double, Unit] = js.native
    
    def closeSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function1[/* fd */ Double, Unit] = js.native
    @JSName("closeSyncRetry")
    var closeSyncRetry_Original: FN[js.Array[Double], js.Function1[/* fd */ Double, Unit]] = js.native
    
    var fsyncAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ js.Any = js.native
    
    def fsyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @JSName("fsyncRetry")
    var fsyncRetry_Original: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ _
      ] = js.native
    
    def fsyncSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function1[/* fd */ Double, Unit] = js.native
    @JSName("fsyncSyncRetry")
    var fsyncSyncRetry_Original: FN[js.Array[Double], js.Function1[/* fd */ Double, Unit]] = js.native
    
    var mkdirAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdir.__promisify__ */ js.Any = js.native
    
    def mkdirSyncAttempt(path: PathLike): js.UndefOr[String] = js.native
    def mkdirSyncAttempt(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
    def mkdirSyncAttempt(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def mkdirSyncAttempt(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def mkdirSyncAttempt(path: PathLike, options: Mode): js.UndefOr[String] = js.native
    @JSName("mkdirSyncAttempt")
    var mkdirSyncAttempt_Original: FnCall = js.native
    @JSName("mkdirSyncAttempt")
    def mkdirSyncAttempt_Unit(path: PathLike): Unit = js.native
    @JSName("mkdirSyncAttempt")
    def mkdirSyncAttempt_Unit(path: PathLike, options: Mode): Unit = js.native
    
    def openRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @JSName("openRetry")
    var openRetry_Original: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.open.__promisify__ */ _
      ] = js.native
    
    def openSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): FnCallPathFlagsMode = js.native
    @JSName("openSyncRetry")
    var openSyncRetry_Original: FN[js.Array[Double], FnCallPathFlagsMode] = js.native
    
    def readFileRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @JSName("readFileRetry")
    var readFileRetry_Original: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ _
      ] = js.native
    
    def readFileSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): Fn0 = js.native
    @JSName("readFileSyncRetry")
    var readFileSyncRetry_Original: FN[js.Array[Double], Fn0] = js.native
    
    var realpathAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.realpath.__promisify__ */ js.Any = js.native
    
    var realpathSyncAttempt: TypeofrealpathSync = js.native
    
    def renameRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @JSName("renameRetry")
    var renameRetry_Original: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rename.__promisify__ */ _
      ] = js.native
    
    def renameSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit] = js.native
    @JSName("renameSyncRetry")
    var renameSyncRetry_Original: FN[
        js.Array[Double], 
        js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit]
      ] = js.native
    
    var statAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ js.Any = js.native
    
    def statRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @JSName("statRetry")
    var statRetry_Original: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ _
      ] = js.native
    
    def statSyncAttempt(path: PathLike): Stats = js.native
    def statSyncAttempt(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    def statSyncAttempt(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
    @JSName("statSyncAttempt")
    var statSyncAttempt_Original: FnCallPathOptions = js.native
    
    def statSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): FnCallPathOptions = js.native
    @JSName("statSyncRetry")
    var statSyncRetry_Original: FN[js.Array[Double], FnCallPathOptions] = js.native
    
    var unlinkAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.unlink.__promisify__ */ js.Any = js.native
    
    def unlinkSyncAttempt(path: PathLike): Unit = js.native
    @JSName("unlinkSyncAttempt")
    var unlinkSyncAttempt_Original: js.Function1[/* path */ PathLike, Unit] = js.native
    
    def writeRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Any = js.native
    @JSName("writeRetry")
    var writeRetry_Original: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.write.__promisify__ */ _
      ] = js.native
    
    def writeSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): FnCallFdBufferOffsetLengthPosition = js.native
    @JSName("writeSyncRetry")
    var writeSyncRetry_Original: FN[js.Array[Double], FnCallFdBufferOffsetLengthPosition] = js.native
  }
}
