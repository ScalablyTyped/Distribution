package typings.atomically

import typings.atomically.anon.FnCall
import typings.atomically.anon.FnCallFdBufferOffsetLengthPosition
import typings.atomically.anon.FnCallPathFlagsMode
import typings.atomically.anon.FnCallPathOptions
import typings.atomically.anon.TypeofrealpathSync
import typings.atomically.distTypesMod.FN
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.StatSyncOptionsbigintbool
import typings.node.anon.StatSyncOptionsbigintfals
import typings.node.anon.StatSyncOptionsbigintfalsBigint
import typings.node.anon.StatSyncOptionsbiginttrue
import typings.node.anon.StatSyncOptionsbiginttrueBigint
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.PathLike
import typings.node.fsMod.StatSyncFn
import typings.node.fsMod.StatSyncOptions
import typings.node.fsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsFsMod {
  
  object default {
    
    @JSImport("atomically/dist/utils/fs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("atomically/dist/utils/fs", "default.chmodAttempt")
    @js.native
    def chmodAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chmod.__promisify__ */ Any = js.native
    inline def chmodAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chmod.__promisify__ */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chmodAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.chmodSyncAttempt")
    @js.native
    def chmodSyncAttempt: js.Function2[/* path */ PathLike, /* mode */ Mode, Unit] = js.native
    inline def chmodSyncAttempt(path: PathLike, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodSyncAttempt")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def chmodSyncAttempt_=(x: js.Function2[/* path */ PathLike, /* mode */ Mode, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chmodSyncAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.chownAttempt")
    @js.native
    def chownAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chown.__promisify__ */ Any = js.native
    inline def chownAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chown.__promisify__ */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chownAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.chownSyncAttempt")
    @js.native
    def chownSyncAttempt: js.Function3[/* path */ PathLike, /* uid */ Double, /* gid */ Double, Unit] = js.native
    inline def chownSyncAttempt(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chownSyncAttempt")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def chownSyncAttempt_=(x: js.Function3[/* path */ PathLike, /* uid */ Double, /* gid */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chownSyncAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.closeAttempt")
    @js.native
    def closeAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ Any = js.native
    inline def closeAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.closeRetry")
    @js.native
    def closeRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ Any
      ] = js.native
    inline def closeRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("closeRetry")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def closeRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.closeSyncAttempt")
    @js.native
    def closeSyncAttempt: js.Function1[/* fd */ Double, Unit] = js.native
    inline def closeSyncAttempt(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSyncAttempt")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def closeSyncAttempt_=(x: js.Function1[/* fd */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeSyncAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.closeSyncRetry")
    @js.native
    def closeSyncRetry: FN[js.Array[Double], js.Function1[/* fd */ Double, Unit]] = js.native
    inline def closeSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function1[/* fd */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSyncRetry")(args.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fd */ Double, Unit]]
    inline def closeSyncRetry_=(x: FN[js.Array[Double], js.Function1[/* fd */ Double, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeSyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.fsyncAttempt")
    @js.native
    def fsyncAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ Any = js.native
    inline def fsyncAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fsyncAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.fsyncRetry")
    @js.native
    def fsyncRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ Any
      ] = js.native
    inline def fsyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fsyncRetry")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def fsyncRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fsyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.fsyncSyncRetry")
    @js.native
    def fsyncSyncRetry: FN[js.Array[Double], js.Function1[/* fd */ Double, Unit]] = js.native
    inline def fsyncSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function1[/* fd */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSyncRetry")(args.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* fd */ Double, Unit]]
    inline def fsyncSyncRetry_=(x: FN[js.Array[Double], js.Function1[/* fd */ Double, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fsyncSyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.mkdirAttempt")
    @js.native
    def mkdirAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdir.__promisify__ */ Any = js.native
    inline def mkdirAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdir.__promisify__ */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mkdirAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.mkdirSyncAttempt")
    @js.native
    def mkdirSyncAttempt: FnCall = js.native
    inline def mkdirSyncAttempt(path: PathLike): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSyncAttempt")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    inline def mkdirSyncAttempt(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSyncAttempt")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def mkdirSyncAttempt(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSyncAttempt")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mkdirSyncAttempt(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSyncAttempt")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def mkdirSyncAttempt(path: PathLike, options: Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSyncAttempt")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def mkdirSyncAttempt_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mkdirSyncAttempt")(x.asInstanceOf[js.Any])
    
    inline def mkdirSyncAttempt_Unit(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSyncAttempt")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mkdirSyncAttempt_Unit(path: PathLike, options: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSyncAttempt")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("atomically/dist/utils/fs", "default.openRetry")
    @js.native
    def openRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.open.__promisify__ */ Any
      ] = js.native
    inline def openRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("openRetry")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def openRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.open.__promisify__ */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.openSyncRetry")
    @js.native
    def openSyncRetry: FN[js.Array[Double], FnCallPathFlagsMode] = js.native
    inline def openSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): FnCallPathFlagsMode = ^.asInstanceOf[js.Dynamic].applyDynamic("openSyncRetry")(args.asInstanceOf[js.Any]).asInstanceOf[FnCallPathFlagsMode]
    inline def openSyncRetry_=(x: FN[js.Array[Double], FnCallPathFlagsMode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openSyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.readFileRetry")
    @js.native
    def readFileRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ Any
      ] = js.native
    inline def readFileRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileRetry")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def readFileRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readFileRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.readFileSyncRetry")
    @js.native
    def readFileSyncRetry: FN[js.Array[Double], FnCallPathOptions] = js.native
    inline def readFileSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): FnCallPathOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSyncRetry")(args.asInstanceOf[js.Any]).asInstanceOf[FnCallPathOptions]
    inline def readFileSyncRetry_=(x: FN[js.Array[Double], FnCallPathOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readFileSyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.realpathAttempt")
    @js.native
    def realpathAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.realpath.__promisify__ */ Any = js.native
    inline def realpathAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.realpath.__promisify__ */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("realpathAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.realpathSyncAttempt")
    @js.native
    def realpathSyncAttempt: TypeofrealpathSync = js.native
    inline def realpathSyncAttempt_=(x: TypeofrealpathSync): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("realpathSyncAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.renameRetry")
    @js.native
    def renameRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rename.__promisify__ */ Any
      ] = js.native
    inline def renameRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("renameRetry")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def renameRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.rename.__promisify__ */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renameRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.renameSyncRetry")
    @js.native
    def renameSyncRetry: FN[
        js.Array[Double], 
        js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit]
      ] = js.native
    inline def renameSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("renameSyncRetry")(args.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit]]
    inline def renameSyncRetry_=(
      x: FN[
          js.Array[Double], 
          js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renameSyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.statAttempt")
    @js.native
    def statAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ Any = js.native
    inline def statAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.statRetry")
    @js.native
    def statRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ Any
      ] = js.native
    inline def statRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("statRetry")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def statRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.statSyncAttempt")
    @js.native
    def statSyncAttempt: StatSyncFn = js.native
    inline def statSyncAttempt(path: PathLike): js.UndefOr[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("statSyncAttempt")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Stats]]
    inline def statSyncAttempt(path: PathLike, options: Unit): Stats = (^.asInstanceOf[js.Dynamic].applyDynamic("statSyncAttempt")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stats]
    inline def statSyncAttempt(path: PathLike, options: StatSyncOptionsbigintbool): Stats | BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("statSyncAttempt")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stats | BigIntStats]
    inline def statSyncAttempt(path: PathLike, options: StatSyncOptionsbigintfals): js.UndefOr[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("statSyncAttempt")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Stats]]
    inline def statSyncAttempt(path: PathLike, options: StatSyncOptionsbigintfalsBigint): Stats = (^.asInstanceOf[js.Dynamic].applyDynamic("statSyncAttempt")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stats]
    inline def statSyncAttempt(path: PathLike, options: StatSyncOptionsbiginttrue): js.UndefOr[BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("statSyncAttempt")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[BigIntStats]]
    inline def statSyncAttempt(path: PathLike, options: StatSyncOptionsbiginttrueBigint): BigIntStats = (^.asInstanceOf[js.Dynamic].applyDynamic("statSyncAttempt")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BigIntStats]
    inline def statSyncAttempt(path: PathLike, options: StatSyncOptions): js.UndefOr[Stats | BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("statSyncAttempt")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Stats | BigIntStats]]
    inline def statSyncAttempt_=(x: StatSyncFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statSyncAttempt")(x.asInstanceOf[js.Any])
    
    inline def statSyncAttempt_Stats(path: PathLike): Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("statSyncAttempt")(path.asInstanceOf[js.Any]).asInstanceOf[Stats]
    
    @JSImport("atomically/dist/utils/fs", "default.statSyncRetry")
    @js.native
    def statSyncRetry: FN[js.Array[Double], StatSyncFn] = js.native
    inline def statSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): StatSyncFn = ^.asInstanceOf[js.Dynamic].applyDynamic("statSyncRetry")(args.asInstanceOf[js.Any]).asInstanceOf[StatSyncFn]
    inline def statSyncRetry_=(x: FN[js.Array[Double], StatSyncFn]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statSyncRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.unlinkAttempt")
    @js.native
    def unlinkAttempt: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.unlink.__promisify__ */ Any = js.native
    inline def unlinkAttempt_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.unlink.__promisify__ */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unlinkAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.unlinkSyncAttempt")
    @js.native
    def unlinkSyncAttempt: js.Function1[/* path */ PathLike, Unit] = js.native
    inline def unlinkSyncAttempt(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkSyncAttempt")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unlinkSyncAttempt_=(x: js.Function1[/* path */ PathLike, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unlinkSyncAttempt")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.writeRetry")
    @js.native
    def writeRetry: FN[
        js.Array[Double], 
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.write.__promisify__ */ Any
      ] = js.native
    inline def writeRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("writeRetry")(args.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def writeRetry_=(
      x: FN[
          js.Array[Double], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.write.__promisify__ */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeRetry")(x.asInstanceOf[js.Any])
    
    @JSImport("atomically/dist/utils/fs", "default.writeSyncRetry")
    @js.native
    def writeSyncRetry: FN[js.Array[Double], FnCallFdBufferOffsetLengthPosition] = js.native
    inline def writeSyncRetry(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Arguments is not an array type */ args: js.Array[Double]
    ): FnCallFdBufferOffsetLengthPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("writeSyncRetry")(args.asInstanceOf[js.Any]).asInstanceOf[FnCallFdBufferOffsetLengthPosition]
    inline def writeSyncRetry_=(x: FN[js.Array[Double], FnCallFdBufferOffsetLengthPosition]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeSyncRetry")(x.asInstanceOf[js.Any])
  }
}
