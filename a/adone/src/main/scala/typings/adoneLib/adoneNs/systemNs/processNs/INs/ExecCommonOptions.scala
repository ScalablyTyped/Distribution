package typings
package adoneLib.adoneNs.systemNs.processNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecCommonOptions extends js.Object {
  /**
    * Explicitly set the value of `argv[0]` sent to the child process.
    * This will be set to `command` or `file` if not specified.
    */
  var argv0: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Keep track of the spawned process and `kill` it when the parent process exits.
    * @default `true`
    */
  var cleanup: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Current working directory of the child process.
    * @default `process.cwd()`
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Prepare child to run independently of its parent process.
    * Specific behavior depends on the platform.
    * @see https://nodejs.org/api/child_process.html#child_process_options_detached
    */
  var detached: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the character encoding used to decode the `stdout` and `stderr` output.
    * @default `utf8`
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Environment key-value pairs.
    * Extends automatically from `process.env`.
    * Set `extendEnv` to `false` if you don"t want this.
    * @default `process.env`
    */
  var env: js.UndefOr[nodeLib.NodeJSNs.ProcessEnv] = js.undefined
  /**
    * Set to `false` if you don't want to extend the environment variables when providing the `env` property.
    * @default `true`
    */
  var extendEnv: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sets the group identity of the process.
    */
  var gid: js.UndefOr[scala.Double] = js.undefined
  /**
    * Signal value to be used when the spawned process will be killed.
    * @default `SIGTERM`
    */
  var killSignal: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Preferred path to find locally installed binaries in (use with `preferLocal`).
    * @default `process.cwd()`
    */
  var localDir: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Largest amount of data in bytes allowed on `stdout` or `stderr`.
    * @default `10000000` (10MB)
    */
  var maxBuffer: js.UndefOr[scala.Double] = js.undefined
  /**
    * Prefer locally installed binaries when looking for a binary to execute.
    * If you `$ npm install foo`, you can then `execa('foo')`.
    * @default `true`
    */
  var preferLocal: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Setting this to `false` resolves the promise with the error instead of rejecting it.
    * @default `true`
    */
  var reject: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `true`, runs `command` inside of a shell.
    * Uses `/bin/sh` on UNIX and `cmd.exe` on Windows.
    * A different shell can be specified as a string.
    * The shell should understand the `-c` switch on UNIX or `/d /s /c` on Windows.
    * @default `false`
    */
  var shell: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    * Used to configure the stderr pipe that is established between the parent and child process.
    * @default `'pipe'`
    * @see https://nodejs.org/api/child_process.html#child_process_options_stdio
    */
  var stderr: js.UndefOr[StdIOOption] = js.undefined
  /**
    * Used to configure the stdin pipe that is established between the parent and child process.
    * @default `'pipe'`
    * @see https://nodejs.org/api/child_process.html#child_process_options_stdio
    */
  var stdin: js.UndefOr[StdIOOption] = js.undefined
  /**
    * The `stdio` option is used to configure the pipes that are established between the parent and child process.
    * By default, the child's stdin, stdout, and stderr are redirected to corresponding `subprocess.stdin`, `subprocess.stdout`, and `subprocess.stderr` streams on the `ChildProcess` object.
    * @default `'pipe'`
    *
    * @see https://nodejs.org/api/child_process.html#child_process_options_stdio
    */
  var stdio: js.UndefOr[
    adoneLib.adoneLibStrings.pipe | adoneLib.adoneLibStrings.ignore | adoneLib.adoneLibStrings.inherit | js.Array[StdIOOption]
  ] = js.undefined
  /**
    * Used to configure the stdout pipe that is established between the parent and child process.
    * @default `'pipe'`
    * @see https://nodejs.org/api/child_process.html#child_process_options_stdio
    */
  var stdout: js.UndefOr[StdIOOption] = js.undefined
  /**
    * Strip EOF (last newline) from the output.
    * @default `true`
    * @see https://github.com/sindresorhus/strip-eof
    */
  var stripEof: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `timeout` is greater than `0`, the parent will send the signal identified by the `killSignal` property
    * (the default is `SIGTERM`) if the child runs longer than `timeout` milliseconds.
    *
    * @default `0`
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the user identity of the process.
    */
  var uid: js.UndefOr[scala.Double] = js.undefined
  /**
    * If `true`, no quoting or escaping of arguments is done on Windows.
    * Ignored on other platforms.
    * This is set to `true` automatically when `shell` is specified.
    * @default `false`
    */
  var windowsVerbatimArguments: js.UndefOr[scala.Boolean] = js.undefined
}

