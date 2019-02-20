package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsCallback extends js.Object {
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val execFileNs: Anon_Args = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val execNs: Anon_Command = js.native
  // no `options` definitely means stdout/stderr are `string`.
  def exec(command: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_Encoding with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_Buffer with nodeLib.childUnderscoreProcessMod.ExecOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_EncodingString with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_Encoding with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.Anon_Buffer with nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  def exec(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecOptions): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecOptions,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def exec(
    command: java.lang.String,
    options: scala.Null,
    callback: js.Function3[
      /* error */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(file: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(file: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    callback: js.Function3[
      nodeLib.Error | scala.Null, 
      nodeLib.Buffer | (/* stdout */ java.lang.String), 
      nodeLib.Buffer | (/* stderr */ java.lang.String), 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: js.UndefOr[scala.Nothing],
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    callback: js.Function3[
      nodeLib.Error | scala.Null, 
      nodeLib.Buffer | (/* stdout */ java.lang.String), 
      nodeLib.Buffer | (/* stderr */ java.lang.String), 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    args: scala.Null,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // no `options` definitely means stdout/stderr are `string`.
  def execFile(
    file: java.lang.String,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFile(
    file: java.lang.String,
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecFileOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // fallback if nothing else matches. Worst case is always `string | Buffer`.
  def execFile(
    file: java.lang.String,
    options: nodeLib.Anon_EncodingNull with nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  def execFile(
    file: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithBufferEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ nodeLib.Buffer, 
      /* stderr */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` with an `encoding` whose type is `string` means stdout/stderr could either be `Buffer` or `string`.
  // There is no guarantee the `encoding` is unknown as `string` is a superset of `BufferEncoding`.
  def execFile(
    file: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithOtherEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String | nodeLib.Buffer, 
      /* stderr */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  def execFile(
    file: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptionsWithStringEncoding,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  def execFile(
    file: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileOptions,
    callback: js.Function3[
      /* error */ nodeLib.Error | scala.Null, 
      /* stdout */ java.lang.String, 
      /* stderr */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def execFileSync(command: java.lang.String): java.lang.String = js.native
  def execFileSync(command: java.lang.String, args: js.Array[java.lang.String]): nodeLib.Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileSyncOptions
  ): nodeLib.Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileSyncOptionsWithBufferEncoding
  ): nodeLib.Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = js.native
  def execFileSync(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecFileSyncOptions): nodeLib.Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileSyncOptionsWithBufferEncoding
  ): nodeLib.Buffer = js.native
  def execFileSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecFileSyncOptionsWithStringEncoding
  ): java.lang.String = js.native
  @JSName("execFileSync")
  def execFileSync_Buffer(command: java.lang.String): nodeLib.Buffer = js.native
  @JSName("execFileSync")
  def execFileSync_String(command: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = js.native
  def execSync(command: java.lang.String): java.lang.String = js.native
  def execSync(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.ExecSyncOptions): nodeLib.Buffer = js.native
  def execSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecSyncOptionsWithBufferEncoding
  ): nodeLib.Buffer = js.native
  def execSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.ExecSyncOptionsWithStringEncoding
  ): java.lang.String = js.native
  @JSName("execSync")
  def execSync_Buffer(command: java.lang.String): nodeLib.Buffer = js.native
  def fork(modulePath: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def fork(modulePath: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def fork(
    modulePath: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.ForkOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(command: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(command: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnOptions
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawn(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.SpawnOptions): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def spawnSync(command: java.lang.String): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(command: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[java.lang.String] = js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptions
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[java.lang.String] = js.native
  def spawnSync(command: java.lang.String, options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptions): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[nodeLib.Buffer] = js.native
  def spawnSync(
    command: java.lang.String,
    options: nodeLib.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
  ): nodeLib.childUnderscoreProcessMod.SpawnSyncReturns[java.lang.String] = js.native
}

