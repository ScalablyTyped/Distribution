package typings.adone

import typings.node.Anon_EncodingNull
import typings.node.Anon_EncodingString
import typings.node.Buffer
import typings.node.Error
import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.node.childUnderscoreProcessMod.ChildProcessWithoutNullStreams
import typings.node.childUnderscoreProcessMod.ExecException
import typings.node.childUnderscoreProcessMod.ExecFileOptions
import typings.node.childUnderscoreProcessMod.ExecFileOptionsWithBufferEncoding
import typings.node.childUnderscoreProcessMod.ExecFileOptionsWithOtherEncoding
import typings.node.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding
import typings.node.childUnderscoreProcessMod.ExecFileSyncOptions
import typings.node.childUnderscoreProcessMod.ExecFileSyncOptionsWithBufferEncoding
import typings.node.childUnderscoreProcessMod.ExecFileSyncOptionsWithStringEncoding
import typings.node.childUnderscoreProcessMod.ExecOptions
import typings.node.childUnderscoreProcessMod.ExecSyncOptions
import typings.node.childUnderscoreProcessMod.ExecSyncOptionsWithBufferEncoding
import typings.node.childUnderscoreProcessMod.ExecSyncOptionsWithStringEncoding
import typings.node.childUnderscoreProcessMod.ForkOptions
import typings.node.childUnderscoreProcessMod.SpawnOptions
import typings.node.childUnderscoreProcessMod.SpawnOptionsWithoutStdio
import typings.node.childUnderscoreProcessMod.SpawnSyncOptions
import typings.node.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
import typings.node.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
import typings.node.childUnderscoreProcessMod.SpawnSyncReturns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofchild_process extends js.Object {
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val execFileNs: TypeofexecFile = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val execNs: Typeofexec = js.native
  // no `options` definitely means stdout/stderr are `string`.
  def exec(command: String): ChildProcess = js.native
  def exec(
    command: String,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  def exec(command: String, options: Anon_EncodingString with ExecOptions): ChildProcess = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  def exec(command: String, options: typings.node.Anon_Encoding with ExecOptions): ChildProcess = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  def exec(command: String, options: typings.node.Anon_Buffer with ExecOptions): ChildProcess = js.native
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  def exec(command: String, options: Anon_EncodingNull with ExecOptions): ChildProcess = js.native
  def exec(
    command: String,
    options: Anon_EncodingNull with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def exec(
    command: String,
    options: typings.node.Anon_Encoding with ExecOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def exec(
    command: String,
    options: typings.node.Anon_Buffer with ExecOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def exec(
    command: String,
    options: Anon_EncodingString with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def exec(
    command: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def exec(
    command: String,
    options: Null,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  def exec(command: String, options: ExecOptions): ChildProcess = js.native
  def exec(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def execFile(file: String): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    callback: js.Function3[Error | Null, Buffer | (/* stdout */ String), Buffer | (/* stderr */ String), Unit]
  ): ChildProcess = js.native
  def execFile(file: String, args: js.UndefOr[scala.Nothing], options: Anon_EncodingNull with ExecFileOptions): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.UndefOr[scala.Nothing],
    options: ExecFileOptions,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def execFile(file: String, args: js.Array[String]): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def execFile(file: String, args: js.Array[String], options: Anon_EncodingNull with ExecFileOptions): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: Anon_EncodingNull with ExecFileOptions,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: js.Array[String],
    options: ExecFileOptions,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: Null,
    callback: js.Function3[Error | Null, Buffer | (/* stdout */ String), Buffer | (/* stderr */ String), Unit]
  ): ChildProcess = js.native
  def execFile(file: String, args: Null, options: Anon_EncodingNull with ExecFileOptions): ChildProcess = js.native
  def execFile(
    file: String,
    args: Null,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: Null,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: Null,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def execFile(
    file: String,
    args: Null,
    options: ExecFileOptions,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  // no `options` definitely means stdout/stderr are `string`.
  def execFile(
    file: String,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def execFile(file: String, options: Anon_EncodingNull with ExecFileOptions): ChildProcess = js.native
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  def execFile(
    file: String,
    options: Anon_EncodingNull with ExecFileOptions,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  def execFile(
    file: String,
    options: ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  def execFile(
    file: String,
    options: ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  def execFile(
    file: String,
    options: ExecFileOptionsWithStringEncoding,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  def execFile(
    file: String,
    options: ExecFileOptions,
    callback: js.Function3[/* error */ Error | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def execFileSync(command: String): Buffer = js.native
  def execFileSync(command: String, args: js.Array[String]): Buffer = js.native
  def execFileSync(command: String, args: js.Array[String], options: ExecFileSyncOptions): Buffer = js.native
  def execFileSync(command: String, args: js.Array[String], options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  def execFileSync(command: String, args: js.Array[String], options: ExecFileSyncOptionsWithStringEncoding): String = js.native
  def execFileSync(command: String, options: ExecFileSyncOptions): Buffer = js.native
  def execFileSync(command: String, options: ExecFileSyncOptionsWithBufferEncoding): Buffer = js.native
  def execFileSync(command: String, options: ExecFileSyncOptionsWithStringEncoding): String = js.native
  @JSName("execFileSync")
  def execFileSync_String(command: String): String = js.native
  @JSName("execFileSync")
  def execFileSync_String(command: String, args: js.Array[String]): String = js.native
  def execSync(command: String): Buffer = js.native
  def execSync(command: String, options: ExecSyncOptions): Buffer = js.native
  def execSync(command: String, options: ExecSyncOptionsWithBufferEncoding): Buffer = js.native
  def execSync(command: String, options: ExecSyncOptionsWithStringEncoding): String = js.native
  @JSName("execSync")
  def execSync_String(command: String): String = js.native
  def fork(modulePath: String): ChildProcess = js.native
  def fork(modulePath: String, args: js.Array[String]): ChildProcess = js.native
  def fork(modulePath: String, args: js.Array[String], options: ForkOptions): ChildProcess = js.native
  def spawn(command: String): ChildProcessWithoutNullStreams = js.native
  def spawn(command: String, args: js.Array[String]): ChildProcessWithoutNullStreams = js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptions): ChildProcess = js.native
  def spawn(command: String, args: js.Array[String], options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def spawn(command: String, options: SpawnOptions): ChildProcess = js.native
  def spawn(command: String, options: SpawnOptionsWithoutStdio): ChildProcessWithoutNullStreams = js.native
  def spawnSync(command: String): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String]): SpawnSyncReturns[String] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def spawnSync(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def spawnSync(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
}

