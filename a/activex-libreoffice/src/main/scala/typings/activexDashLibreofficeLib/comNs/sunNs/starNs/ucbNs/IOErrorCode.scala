package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Types of input/output errors.
  *
  * See {@link com.sun.star.task.InteractionHandler} for a description of what kinds of arguments {@link InteractiveAugmentedIOException} should use with
  * each of these error codes.
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`12`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`13`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`14`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`15`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`16`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`17`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`18`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`19`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`20`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`21`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`25`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`26`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`22`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`23`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`24`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`27`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`28`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`29`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`30`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`31`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`32`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`33`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`34`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`35`
*/
trait IOErrorCode extends js.Object

object IOErrorCode {
  /** An operation was aborted. */
  @scala.inline
  def ABORT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** An object cannot be accessed due to insufficient user rights. */
  @scala.inline
  def ACCESS_DENIED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** An object already exists. */
  @scala.inline
  def ALREADY_EXISTING: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** A bad checksum. */
  @scala.inline
  def BAD_CRC: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** An object could not be created. */
  @scala.inline
  def CANT_CREATE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** Data could not be read from a file. */
  @scala.inline
  def CANT_READ: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** A seek operation could not be run. */
  @scala.inline
  def CANT_SEEK: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /** A tell operation could not be run. */
  @scala.inline
  def CANT_TELL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  /** Data could not be written to a file. */
  @scala.inline
  def CANT_WRITE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8` = this.cast(8)
  /** A function is not possible because the path contains the current directory. */
  @scala.inline
  def CURRENT_DIRECTORY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`9` = this.cast(9)
  /** A device (drive) not ready. */
  @scala.inline
  def DEVICE_NOT_READY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`10` = this.cast(10)
  /** A function is not possible because the devices (drives) are not identical. */
  @scala.inline
  def DIFFERENT_DEVICES: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`11` = this.cast(11)
  /** A general input/output error. */
  @scala.inline
  def GENERAL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`12` = this.cast(12)
  /** An invalid attempt was made to access an object. */
  @scala.inline
  def INVALID_ACCESS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`13` = this.cast(13)
  /** A file name contains invalid characters. */
  @scala.inline
  def INVALID_CHARACTER: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`14` = this.cast(14)
  /** A specified device is invalid. */
  @scala.inline
  def INVALID_DEVICE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`15` = this.cast(15)
  /** Invalid data length. */
  @scala.inline
  def INVALID_LENGTH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`16` = this.cast(16)
  /** An operation was started with an invalid parameter. */
  @scala.inline
  def INVALID_PARAMETER: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`17` = this.cast(17)
  /** An operation cannot be run on file names containing wildcards. */
  @scala.inline
  def IS_WILDCARD: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`18` = this.cast(18)
  /** A locking problem. */
  @scala.inline
  def LOCKING_VIOLATION: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`19` = this.cast(19)
  /** An invalid file name. */
  @scala.inline
  def MISPLACED_CHARACTER: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`20` = this.cast(20)
  /** A file name is too long. */
  @scala.inline
  def NAME_TOO_LONG: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`21` = this.cast(21)
  /** A nonexistent object. */
  @scala.inline
  def NOT_EXISTING: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`22` = this.cast(22)
  /** The path to a file does not exist. */
  @scala.inline
  def NOT_EXISTING_PATH: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`23` = this.cast(23)
  /** An action is not supported. */
  @scala.inline
  def NOT_SUPPORTED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`24` = this.cast(24)
  /** An object is not a directory. */
  @scala.inline
  def NO_DIRECTORY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`25` = this.cast(25)
  /** An object is not a file. */
  @scala.inline
  def NO_FILE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`26` = this.cast(26)
  /** No more space on a device. */
  @scala.inline
  def OUT_OF_DISK_SPACE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`27` = this.cast(27)
  /** No more file handles available. */
  @scala.inline
  def OUT_OF_FILE_HANDLES: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`28` = this.cast(28)
  /** An operation could not be run due to insufficient memory. */
  @scala.inline
  def OUT_OF_MEMORY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`29` = this.cast(29)
  /** An operation is still pending. */
  @scala.inline
  def PENDING: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`30` = this.cast(30)
  /** An object cannot be copied into itself. */
  @scala.inline
  def RECURSIVE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`31` = this.cast(31)
  /**
    * Unknown.
    *
    * An unknown I/O error has occurred.
    */
  @scala.inline
  def UNKNOWN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`32` = this.cast(32)
  /** A function is not possible because the object is write protected. */
  @scala.inline
  def WRITE_PROTECTED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`33` = this.cast(33)
  /** An incorrect file format. */
  @scala.inline
  def WRONG_FORMAT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`34` = this.cast(34)
  /** An incorrect file version. */
  @scala.inline
  def WRONG_VERSION: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`35` = this.cast(35)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

