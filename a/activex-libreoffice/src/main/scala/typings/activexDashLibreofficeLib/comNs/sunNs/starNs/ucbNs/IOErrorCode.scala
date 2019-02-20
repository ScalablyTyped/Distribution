package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IOErrorCode extends js.Object

/**
  * Types of input/output errors.
  *
  * See {@link com.sun.star.task.InteractionHandler} for a description of what kinds of arguments {@link InteractiveAugmentedIOException} should use with
  * each of these error codes.
  */
@JSGlobal("com.sun.star.ucb.IOErrorCode")
@js.native
object IOErrorCode extends js.Object {
  /** An operation was aborted. */
  @js.native
  sealed trait ABORT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An object cannot be accessed due to insufficient user rights. */
  @js.native
  sealed trait ACCESS_DENIED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An object already exists. */
  @js.native
  sealed trait ALREADY_EXISTING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** A bad checksum. */
  @js.native
  sealed trait BAD_CRC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An object could not be created. */
  @js.native
  sealed trait CANT_CREATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** Data could not be read from a file. */
  @js.native
  sealed trait CANT_READ
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** A seek operation could not be run. */
  @js.native
  sealed trait CANT_SEEK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** A tell operation could not be run. */
  @js.native
  sealed trait CANT_TELL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** Data could not be written to a file. */
  @js.native
  sealed trait CANT_WRITE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** A function is not possible because the path contains the current directory. */
  @js.native
  sealed trait CURRENT_DIRECTORY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** A device (drive) not ready. */
  @js.native
  sealed trait DEVICE_NOT_READY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** A function is not possible because the devices (drives) are not identical. */
  @js.native
  sealed trait DIFFERENT_DEVICES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** A general input/output error. */
  @js.native
  sealed trait GENERAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An invalid attempt was made to access an object. */
  @js.native
  sealed trait INVALID_ACCESS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** A file name contains invalid characters. */
  @js.native
  sealed trait INVALID_CHARACTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** A specified device is invalid. */
  @js.native
  sealed trait INVALID_DEVICE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** Invalid data length. */
  @js.native
  sealed trait INVALID_LENGTH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An operation was started with an invalid parameter. */
  @js.native
  sealed trait INVALID_PARAMETER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An operation cannot be run on file names containing wildcards. */
  @js.native
  sealed trait IS_WILDCARD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** A locking problem. */
  @js.native
  sealed trait LOCKING_VIOLATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An invalid file name. */
  @js.native
  sealed trait MISPLACED_CHARACTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** A file name is too long. */
  @js.native
  sealed trait NAME_TOO_LONG
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** A nonexistent object. */
  @js.native
  sealed trait NOT_EXISTING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** The path to a file does not exist. */
  @js.native
  sealed trait NOT_EXISTING_PATH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An action is not supported. */
  @js.native
  sealed trait NOT_SUPPORTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An object is not a directory. */
  @js.native
  sealed trait NO_DIRECTORY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An object is not a file. */
  @js.native
  sealed trait NO_FILE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** No more space on a device. */
  @js.native
  sealed trait OUT_OF_DISK_SPACE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** No more file handles available. */
  @js.native
  sealed trait OUT_OF_FILE_HANDLES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An operation could not be run due to insufficient memory. */
  @js.native
  sealed trait OUT_OF_MEMORY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An operation is still pending. */
  @js.native
  sealed trait PENDING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An object cannot be copied into itself. */
  @js.native
  sealed trait RECURSIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /**
    * Unknown.
    *
    * An unknown I/O error has occurred.
    */
  @js.native
  sealed trait UNKNOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** A function is not possible because the object is write protected. */
  @js.native
  sealed trait WRITE_PROTECTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An incorrect file format. */
  @js.native
  sealed trait WRONG_FORMAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /** An incorrect file version. */
  @js.native
  sealed trait WRONG_VERSION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode
  
  /* 0 */ val ABORT: ABORT with scala.Double = js.native
  /* 1 */ val ACCESS_DENIED: ACCESS_DENIED with scala.Double = js.native
  /* 2 */ val ALREADY_EXISTING: ALREADY_EXISTING with scala.Double = js.native
  /* 3 */ val BAD_CRC: BAD_CRC with scala.Double = js.native
  /* 4 */ val CANT_CREATE: CANT_CREATE with scala.Double = js.native
  /* 5 */ val CANT_READ: CANT_READ with scala.Double = js.native
  /* 6 */ val CANT_SEEK: CANT_SEEK with scala.Double = js.native
  /* 7 */ val CANT_TELL: CANT_TELL with scala.Double = js.native
  /* 8 */ val CANT_WRITE: CANT_WRITE with scala.Double = js.native
  /* 9 */ val CURRENT_DIRECTORY: CURRENT_DIRECTORY with scala.Double = js.native
  /* 10 */ val DEVICE_NOT_READY: DEVICE_NOT_READY with scala.Double = js.native
  /* 11 */ val DIFFERENT_DEVICES: DIFFERENT_DEVICES with scala.Double = js.native
  /* 12 */ val GENERAL: GENERAL with scala.Double = js.native
  /* 13 */ val INVALID_ACCESS: INVALID_ACCESS with scala.Double = js.native
  /* 14 */ val INVALID_CHARACTER: INVALID_CHARACTER with scala.Double = js.native
  /* 15 */ val INVALID_DEVICE: INVALID_DEVICE with scala.Double = js.native
  /* 16 */ val INVALID_LENGTH: INVALID_LENGTH with scala.Double = js.native
  /* 17 */ val INVALID_PARAMETER: INVALID_PARAMETER with scala.Double = js.native
  /* 18 */ val IS_WILDCARD: IS_WILDCARD with scala.Double = js.native
  /* 19 */ val LOCKING_VIOLATION: LOCKING_VIOLATION with scala.Double = js.native
  /* 20 */ val MISPLACED_CHARACTER: MISPLACED_CHARACTER with scala.Double = js.native
  /* 21 */ val NAME_TOO_LONG: NAME_TOO_LONG with scala.Double = js.native
  /* 22 */ val NOT_EXISTING: NOT_EXISTING with scala.Double = js.native
  /* 23 */ val NOT_EXISTING_PATH: NOT_EXISTING_PATH with scala.Double = js.native
  /* 24 */ val NOT_SUPPORTED: NOT_SUPPORTED with scala.Double = js.native
  /* 25 */ val NO_DIRECTORY: NO_DIRECTORY with scala.Double = js.native
  /* 26 */ val NO_FILE: NO_FILE with scala.Double = js.native
  /* 27 */ val OUT_OF_DISK_SPACE: OUT_OF_DISK_SPACE with scala.Double = js.native
  /* 28 */ val OUT_OF_FILE_HANDLES: OUT_OF_FILE_HANDLES with scala.Double = js.native
  /* 29 */ val OUT_OF_MEMORY: OUT_OF_MEMORY with scala.Double = js.native
  /* 30 */ val PENDING: PENDING with scala.Double = js.native
  /* 31 */ val RECURSIVE: RECURSIVE with scala.Double = js.native
  /* 32 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  /* 33 */ val WRITE_PROTECTED: WRITE_PROTECTED with scala.Double = js.native
  /* 34 */ val WRONG_FORMAT: WRONG_FORMAT with scala.Double = js.native
  /* 35 */ val WRONG_VERSION: WRONG_VERSION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.IOErrorCode with scala.Double] = js.native
}

