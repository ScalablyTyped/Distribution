package typings
package awsDashSdkLib.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written to). If you set Atime to BEST_EFFORT, DataSync attempts to preserve the original Atime attribute on all source files (that is, the version before the PREPARING phase). However, Atime's behavior is not fully standard across platforms, so AWS DataSync can only do this on a best-effort basis.  Default value: BEST_EFFORT. BEST_EFFORT: Attempt to preserve the per-file Atime value (recommended). NONE: Ignore Atime.  If Atime is set to BEST_EFFORT, Mtime must be set to PRESERVE.  If Atime is set to NONE, Mtime must also be NONE.  
    */
  var Atime: js.UndefOr[Atime] = js.undefined
  /**
    * A value that limits the bandwidth used by AWS DataSync. For example, if you want AWS DataSync to use a maximum of 1 MB, set this value to 1048576 (=1024*1024).
    */
  var BytesPerSecond: js.UndefOr[BytesPerSecond] = js.undefined
  /**
    * The group ID (GID) of the file's owners.  Default value: INT_VALUE. This preserves the integer value of the ID. INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended). NONE: Ignore UID and GID. 
    */
  var Gid: js.UndefOr[Gid] = js.undefined
  /**
    * A value that indicates the last time that a file was modified (that is, a file was written to) before the PREPARING phase.  Default value: PRESERVE.  PRESERVE: Preserve original Mtime (recommended)  NONE: Ignore Mtime.   If Mtime is set to PRESERVE, Atime must be set to BEST_EFFORT. If Mtime is set to NONE, Atime must also be set to NONE.  
    */
  var Mtime: js.UndefOr[Mtime] = js.undefined
  /**
    * A value that determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file.  Default value: PRESERVE. PRESERVE: Preserve POSIX-style permissions (recommended). NONE: Ignore permissions.   AWS DataSync can preserve extant permissions of a source location. 
    */
  var PosixPermissions: js.UndefOr[PosixPermissions] = js.undefined
  /**
    * A value that specifies whether files in the destination that don't exist in the source file system should be preserved.  Default value: PRESERVE. PRESERVE: Ignore such destination files (recommended).  REMOVE: Delete destination files that aren’t present in the source.
    */
  var PreserveDeletedFiles: js.UndefOr[PreserveDeletedFiles] = js.undefined
  /**
    * A value that determines whether AWS DataSync should preserve the metadata of block and character devices in the source file system, and recreate the files with that device name and metadata on the destination.  AWS DataSync can't sync the actual contents of such devices, because they are nonterminal and don't return an end-of-file (EOF) marker.  Default value: NONE. NONE: Ignore special devices (recommended).  PRESERVE: Preserve character and block device metadata. This option isn't currently supported for Amazon EFS. 
    */
  var PreserveDevices: js.UndefOr[PreserveDevices] = js.undefined
  /**
    * The user ID (UID) of the file's owner.  Default value: INT_VALUE. This preserves the integer value of the ID. INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended). NONE: Ignore UID and GID. 
    */
  var Uid: js.UndefOr[Uid] = js.undefined
  /**
    * A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred.  Default value: POINT_IN_TIME_CONSISTENT. POINT_IN_TIME_CONSISTENT: Perform verification (recommended).  NONE: Skip verification.
    */
  var VerifyMode: js.UndefOr[VerifyMode] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    Atime: Atime = null,
    BytesPerSecond: js.UndefOr[BytesPerSecond] = js.undefined,
    Gid: Gid = null,
    Mtime: Mtime = null,
    PosixPermissions: PosixPermissions = null,
    PreserveDeletedFiles: PreserveDeletedFiles = null,
    PreserveDevices: PreserveDevices = null,
    Uid: Uid = null,
    VerifyMode: VerifyMode = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (Atime != null) __obj.updateDynamic("Atime")(Atime.asInstanceOf[js.Any])
    if (!js.isUndefined(BytesPerSecond)) __obj.updateDynamic("BytesPerSecond")(BytesPerSecond)
    if (Gid != null) __obj.updateDynamic("Gid")(Gid.asInstanceOf[js.Any])
    if (Mtime != null) __obj.updateDynamic("Mtime")(Mtime.asInstanceOf[js.Any])
    if (PosixPermissions != null) __obj.updateDynamic("PosixPermissions")(PosixPermissions.asInstanceOf[js.Any])
    if (PreserveDeletedFiles != null) __obj.updateDynamic("PreserveDeletedFiles")(PreserveDeletedFiles.asInstanceOf[js.Any])
    if (PreserveDevices != null) __obj.updateDynamic("PreserveDevices")(PreserveDevices.asInstanceOf[js.Any])
    if (Uid != null) __obj.updateDynamic("Uid")(Uid.asInstanceOf[js.Any])
    if (VerifyMode != null) __obj.updateDynamic("VerifyMode")(VerifyMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

