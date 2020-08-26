package typings.atomically

import typings.atomically.anon.Fn0
import typings.atomically.anon.Fn1
import typings.atomically.anon.Fn2
import typings.atomically.anon.Fn3
import typings.atomically.anon.Fn4
import typings.atomically.anon.FnCall
import typings.atomically.anon.FnCallFdBufferOffsetLengthPosition
import typings.atomically.anon.FnCallPathFlagsMode
import typings.atomically.anon.FnCallPathOptions
import typings.atomically.anon.TypeofrealpathSync
import typings.atomically.typesMod.FN
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.fsMod.BaseEncodingOptions
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atomically/dist/utils/fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  @js.native
  object default extends js.Object {
    @JSName("chmodAttempt")
    var chmodAttempt_Original: js.Function2[/* path */ PathLike, /* mode */ Mode, js.Promise[Unit]] = js.native
    @JSName("chmodSyncAttempt")
    var chmodSyncAttempt_Original: js.Function2[/* path */ PathLike, /* mode */ Mode, Unit] = js.native
    @JSName("chownAttempt")
    var chownAttempt_Original: js.Function3[/* path */ PathLike, /* uid */ Double, /* gid */ Double, js.Promise[Unit]] = js.native
    @JSName("chownSyncAttempt")
    var chownSyncAttempt_Original: js.Function3[/* path */ PathLike, /* uid */ Double, /* gid */ Double, Unit] = js.native
    @JSName("closeAttempt")
    var closeAttempt_Original: js.Function1[/* fd */ Double, js.Promise[Unit]] = js.native
    @JSName("closeRetry")
    var closeRetry_Original: FN[js.Array[Double], js.Function1[/* fd */ Double, js.Promise[Unit]]] = js.native
    @JSName("closeSyncAttempt")
    var closeSyncAttempt_Original: js.Function1[/* fd */ Double, Unit] = js.native
    @JSName("closeSyncRetry")
    var closeSyncRetry_Original: FN[js.Array[Double], js.Function1[/* fd */ Double, Unit]] = js.native
    @JSName("fsyncAttempt")
    var fsyncAttempt_Original: js.Function1[/* fd */ Double, js.Promise[Unit]] = js.native
    @JSName("fsyncRetry")
    var fsyncRetry_Original: FN[js.Array[Double], js.Function1[/* fd */ Double, js.Promise[Unit]]] = js.native
    @JSName("fsyncSyncRetry")
    var fsyncSyncRetry_Original: FN[js.Array[Double], js.Function1[/* fd */ Double, Unit]] = js.native
    @JSName("mkdirAttempt")
    var mkdirAttempt_Original: FnCall = js.native
    @JSName("mkdirSyncAttempt")
    var mkdirSyncAttempt_Original: Fn1 = js.native
    @JSName("openRetry")
    var openRetry_Original: FN[js.Array[Double], FnCallPathFlagsMode] = js.native
    @JSName("openSyncRetry")
    var openSyncRetry_Original: FN[js.Array[Double], Fn2] = js.native
    @JSName("readFileRetry")
    var readFileRetry_Original: FN[js.Array[Double], Fn0] = js.native
    @JSName("readFileSyncRetry")
    var readFileSyncRetry_Original: FN[js.Array[Double], Fn3] = js.native
    @JSName("realpathAttempt")
    var realpathAttempt_Original: FnCallPathOptions = js.native
    var realpathSyncAttempt: TypeofrealpathSync = js.native
    @JSName("renameRetry")
    var renameRetry_Original: FN[
        js.Array[Double], 
        js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, js.Promise[Unit]]
      ] = js.native
    @JSName("renameSyncRetry")
    var renameSyncRetry_Original: FN[
        js.Array[Double], 
        js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit]
      ] = js.native
    @JSName("statAttempt")
    var statAttempt_Original: js.Function1[/* path */ PathLike, js.Promise[Stats]] = js.native
    @JSName("statSyncAttempt")
    var statSyncAttempt_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    @JSName("unlinkAttempt")
    var unlinkAttempt_Original: js.Function1[/* path */ PathLike, js.Promise[Unit]] = js.native
    @JSName("unlinkSyncAttempt")
    var unlinkSyncAttempt_Original: js.Function1[/* path */ PathLike, Unit] = js.native
    @JSName("writeRetry")
    var writeRetry_Original: FN[js.Array[Double], FnCallFdBufferOffsetLengthPosition] = js.native
    @JSName("writeSyncRetry")
    var writeSyncRetry_Original: FN[js.Array[Double], Fn4] = js.native
    def chmodAttempt(path: PathLike, mode: Mode): js.Promise[Unit] = js.native
    def chmodSyncAttempt(path: PathLike, mode: Mode): Unit = js.native
    def chownAttempt(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = js.native
    def chownSyncAttempt(path: PathLike, uid: Double, gid: Double): Unit = js.native
    def closeAttempt(fd: Double): js.Promise[Unit] = js.native
    def closeRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function1[/* fd */ Double, js.Promise[Unit]] = js.native
    def closeSyncAttempt(fd: Double): Unit = js.native
    def closeSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function1[/* fd */ Double, Unit] = js.native
    def fsyncAttempt(fd: Double): js.Promise[Unit] = js.native
    def fsyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function1[/* fd */ Double, js.Promise[Unit]] = js.native
    def fsyncSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function1[/* fd */ Double, Unit] = js.native
    def mkdirAttempt(path: PathLike): js.Promise[js.UndefOr[String]] = js.native
    def mkdirAttempt(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[String] = js.native
    def mkdirAttempt(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = js.native
    def mkdirAttempt(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[String]] = js.native
    def mkdirAttempt(path: PathLike, options: Mode): js.Promise[js.UndefOr[String]] = js.native
    def mkdirSyncAttempt(path: PathLike): js.UndefOr[String] = js.native
    def mkdirSyncAttempt(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
    def mkdirSyncAttempt(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def mkdirSyncAttempt(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def mkdirSyncAttempt(path: PathLike, options: Mode): js.UndefOr[String] = js.native
    @JSName("mkdirSyncAttempt")
    def mkdirSyncAttempt_Unit(path: PathLike): Unit = js.native
    @JSName("mkdirSyncAttempt")
    def mkdirSyncAttempt_Unit(path: PathLike, options: Mode): Unit = js.native
    def openRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): FnCallPathFlagsMode = js.native
    def openSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): Fn2 = js.native
    def readFileRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): Fn0 = js.native
    def readFileSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): Fn3 = js.native
    def realpathAttempt(path: PathLike): js.Promise[String | Buffer] = js.native
    def realpathAttempt(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    def realpathAttempt(path: PathLike, options: BufferEncoding): js.Promise[String] = js.native
    def realpathAttempt(path: PathLike, options: BaseEncodingOptions): js.Promise[String | Buffer] = js.native
    def realpathAttempt(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = js.native
    def renameRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, js.Promise[Unit]] = js.native
    def renameSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit] = js.native
    def statAttempt(path: PathLike): js.Promise[Stats] = js.native
    def statSyncAttempt(path: PathLike): Stats = js.native
    def unlinkAttempt(path: PathLike): js.Promise[Unit] = js.native
    def unlinkSyncAttempt(path: PathLike): Unit = js.native
    def writeRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): FnCallFdBufferOffsetLengthPosition = js.native
    def writeSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): Fn4 = js.native
  }
  
}

