package typings.atom.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpawnProcessOptions extends js.Object {
  /** Current working directory of the child process. */
  var cwd: js.UndefOr[String] = js.native
  /** Prepare child to run independently of its parent process. */
  var detached: js.UndefOr[Boolean] = js.native
  /** Environment key-value pairs. */
  var env: js.UndefOr[StringDictionary[String]] = js.native
  /** Sets the group identity of the process. */
  var gid: js.UndefOr[Double] = js.native
  /**
    *  If true, runs command inside of a shell. Uses "/bin/sh" on UNIX, and process.env.ComSpec
    *  on Windows. A different shell can be specified as a string.
    */
  var shell: js.UndefOr[Boolean | String] = js.native
  /** The child's stdio configuration. */
  var stdio: js.UndefOr[String | (js.Array[String | Double])] = js.native
  /** Sets the user identity of the process. */
  var uid: js.UndefOr[Double] = js.native
}

object SpawnProcessOptions {
  @scala.inline
  def apply(): SpawnProcessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpawnProcessOptions]
  }
  @scala.inline
  implicit class SpawnProcessOptionsOps[Self <: SpawnProcessOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setDetached(value: Boolean): Self = this.set("detached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    @scala.inline
    def setEnv(value: StringDictionary[String]): Self = this.set("env", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    @scala.inline
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    @scala.inline
    def setShell(value: Boolean | String): Self = this.set("shell", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
    @scala.inline
    def setStdioVarargs(value: (String | Double)*): Self = this.set("stdio", js.Array(value :_*))
    @scala.inline
    def setStdio(value: String | (js.Array[String | Double])): Self = this.set("stdio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdio: Self = this.set("stdio", js.undefined)
    @scala.inline
    def setUid(value: Double): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
  
}

