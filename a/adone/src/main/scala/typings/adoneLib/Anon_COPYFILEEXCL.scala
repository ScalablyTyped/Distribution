package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_COPYFILEEXCL extends js.Object {
  // File Copy Constants
  /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
  val COPYFILE_EXCL: scala.Double
  /**
    * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
    * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
    */
  val COPYFILE_FICLONE: scala.Double
  /**
    * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
    * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
    */
  val COPYFILE_FICLONE_FORCE: scala.Double
  // File Access Constants
  /** Constant for fs.access(). File is visible to the calling process. */
  val F_OK: scala.Double
  /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
  val O_APPEND: scala.Double
  /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
  val O_CREAT: scala.Double
  /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
  val O_DIRECT: scala.Double
  /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
  val O_DIRECTORY: scala.Double
  /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
  val O_DSYNC: scala.Double
  /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
  val O_EXCL: scala.Double
  /**
    * constant for fs.open().
    * Flag indicating reading accesses to the file system will no longer result in
    * an update to the atime information associated with the file.
    * This flag is available on Linux operating systems only.
    */
  val O_NOATIME: scala.Double
  /**
    * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
    * opening the path shall not cause that terminal to become the controlling terminal for the process
    * (if the process does not already have one).
    */
  val O_NOCTTY: scala.Double
  /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
  val O_NOFOLLOW: scala.Double
  /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
  val O_NONBLOCK: scala.Double
  // File Open Constants
  /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
  val O_RDONLY: scala.Double
  /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
  val O_RDWR: scala.Double
  /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
  val O_SYMLINK: scala.Double
  /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
  val O_SYNC: scala.Double
  /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
  val O_TRUNC: scala.Double
  /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
  val O_WRONLY: scala.Double
  /** Constant for fs.access(). File can be read by the calling process. */
  val R_OK: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
  val S_IFBLK: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
  val S_IFCHR: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
  val S_IFDIR: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
  val S_IFIFO: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
  val S_IFLNK: scala.Double
  // File Type Constants
  /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
  val S_IFMT: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
  val S_IFREG: scala.Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
  val S_IFSOCK: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
  val S_IRGRP: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
  val S_IROTH: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
  val S_IRUSR: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
  val S_IRWXG: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
  val S_IRWXO: scala.Double
  // File Mode Constants
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
  val S_IRWXU: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
  val S_IWGRP: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
  val S_IWOTH: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
  val S_IWUSR: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
  val S_IXGRP: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
  val S_IXOTH: scala.Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
  val S_IXUSR: scala.Double
  /** Constant for fs.access(). File can be written by the calling process. */
  val W_OK: scala.Double
  /** Constant for fs.access(). File can be executed by the calling process. */
  val X_OK: scala.Double
}

object Anon_COPYFILEEXCL {
  @scala.inline
  def apply(
    COPYFILE_EXCL: scala.Double,
    COPYFILE_FICLONE: scala.Double,
    COPYFILE_FICLONE_FORCE: scala.Double,
    F_OK: scala.Double,
    O_APPEND: scala.Double,
    O_CREAT: scala.Double,
    O_DIRECT: scala.Double,
    O_DIRECTORY: scala.Double,
    O_DSYNC: scala.Double,
    O_EXCL: scala.Double,
    O_NOATIME: scala.Double,
    O_NOCTTY: scala.Double,
    O_NOFOLLOW: scala.Double,
    O_NONBLOCK: scala.Double,
    O_RDONLY: scala.Double,
    O_RDWR: scala.Double,
    O_SYMLINK: scala.Double,
    O_SYNC: scala.Double,
    O_TRUNC: scala.Double,
    O_WRONLY: scala.Double,
    R_OK: scala.Double,
    S_IFBLK: scala.Double,
    S_IFCHR: scala.Double,
    S_IFDIR: scala.Double,
    S_IFIFO: scala.Double,
    S_IFLNK: scala.Double,
    S_IFMT: scala.Double,
    S_IFREG: scala.Double,
    S_IFSOCK: scala.Double,
    S_IRGRP: scala.Double,
    S_IROTH: scala.Double,
    S_IRUSR: scala.Double,
    S_IRWXG: scala.Double,
    S_IRWXO: scala.Double,
    S_IRWXU: scala.Double,
    S_IWGRP: scala.Double,
    S_IWOTH: scala.Double,
    S_IWUSR: scala.Double,
    S_IXGRP: scala.Double,
    S_IXOTH: scala.Double,
    S_IXUSR: scala.Double,
    W_OK: scala.Double,
    X_OK: scala.Double
  ): Anon_COPYFILEEXCL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("COPYFILE_EXCL")(COPYFILE_EXCL)
    __obj.updateDynamic("COPYFILE_FICLONE")(COPYFILE_FICLONE)
    __obj.updateDynamic("COPYFILE_FICLONE_FORCE")(COPYFILE_FICLONE_FORCE)
    __obj.updateDynamic("F_OK")(F_OK)
    __obj.updateDynamic("O_APPEND")(O_APPEND)
    __obj.updateDynamic("O_CREAT")(O_CREAT)
    __obj.updateDynamic("O_DIRECT")(O_DIRECT)
    __obj.updateDynamic("O_DIRECTORY")(O_DIRECTORY)
    __obj.updateDynamic("O_DSYNC")(O_DSYNC)
    __obj.updateDynamic("O_EXCL")(O_EXCL)
    __obj.updateDynamic("O_NOATIME")(O_NOATIME)
    __obj.updateDynamic("O_NOCTTY")(O_NOCTTY)
    __obj.updateDynamic("O_NOFOLLOW")(O_NOFOLLOW)
    __obj.updateDynamic("O_NONBLOCK")(O_NONBLOCK)
    __obj.updateDynamic("O_RDONLY")(O_RDONLY)
    __obj.updateDynamic("O_RDWR")(O_RDWR)
    __obj.updateDynamic("O_SYMLINK")(O_SYMLINK)
    __obj.updateDynamic("O_SYNC")(O_SYNC)
    __obj.updateDynamic("O_TRUNC")(O_TRUNC)
    __obj.updateDynamic("O_WRONLY")(O_WRONLY)
    __obj.updateDynamic("R_OK")(R_OK)
    __obj.updateDynamic("S_IFBLK")(S_IFBLK)
    __obj.updateDynamic("S_IFCHR")(S_IFCHR)
    __obj.updateDynamic("S_IFDIR")(S_IFDIR)
    __obj.updateDynamic("S_IFIFO")(S_IFIFO)
    __obj.updateDynamic("S_IFLNK")(S_IFLNK)
    __obj.updateDynamic("S_IFMT")(S_IFMT)
    __obj.updateDynamic("S_IFREG")(S_IFREG)
    __obj.updateDynamic("S_IFSOCK")(S_IFSOCK)
    __obj.updateDynamic("S_IRGRP")(S_IRGRP)
    __obj.updateDynamic("S_IROTH")(S_IROTH)
    __obj.updateDynamic("S_IRUSR")(S_IRUSR)
    __obj.updateDynamic("S_IRWXG")(S_IRWXG)
    __obj.updateDynamic("S_IRWXO")(S_IRWXO)
    __obj.updateDynamic("S_IRWXU")(S_IRWXU)
    __obj.updateDynamic("S_IWGRP")(S_IWGRP)
    __obj.updateDynamic("S_IWOTH")(S_IWOTH)
    __obj.updateDynamic("S_IWUSR")(S_IWUSR)
    __obj.updateDynamic("S_IXGRP")(S_IXGRP)
    __obj.updateDynamic("S_IXOTH")(S_IXOTH)
    __obj.updateDynamic("S_IXUSR")(S_IXUSR)
    __obj.updateDynamic("W_OK")(W_OK)
    __obj.updateDynamic("X_OK")(X_OK)
    __obj.asInstanceOf[Anon_COPYFILEEXCL]
  }
}

