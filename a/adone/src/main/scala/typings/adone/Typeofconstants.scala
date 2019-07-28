package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofconstants extends js.Object {
  // File Copy Constants
  /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
  val COPYFILE_EXCL: Double
  /**
    * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
    * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
    */
  val COPYFILE_FICLONE: Double
  /**
    * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
    * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
    */
  val COPYFILE_FICLONE_FORCE: Double
  // File Access Constants
  /** Constant for fs.access(). File is visible to the calling process. */
  val F_OK: Double
  /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
  val O_APPEND: Double
  /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
  val O_CREAT: Double
  /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
  val O_DIRECT: Double
  /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
  val O_DIRECTORY: Double
  /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
  val O_DSYNC: Double
  /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
  val O_EXCL: Double
  /**
    * constant for fs.open().
    * Flag indicating reading accesses to the file system will no longer result in
    * an update to the atime information associated with the file.
    * This flag is available on Linux operating systems only.
    */
  val O_NOATIME: Double
  /**
    * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
    * opening the path shall not cause that terminal to become the controlling terminal for the process
    * (if the process does not already have one).
    */
  val O_NOCTTY: Double
  /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
  val O_NOFOLLOW: Double
  /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
  val O_NONBLOCK: Double
  // File Open Constants
  /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
  val O_RDONLY: Double
  /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
  val O_RDWR: Double
  /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
  val O_SYMLINK: Double
  /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
  val O_SYNC: Double
  /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
  val O_TRUNC: Double
  /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
  val O_WRONLY: Double
  /** Constant for fs.access(). File can be read by the calling process. */
  val R_OK: Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
  val S_IFBLK: Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
  val S_IFCHR: Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
  val S_IFDIR: Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
  val S_IFIFO: Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
  val S_IFLNK: Double
  // File Type Constants
  /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
  val S_IFMT: Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
  val S_IFREG: Double
  /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
  val S_IFSOCK: Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
  val S_IRGRP: Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
  val S_IROTH: Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
  val S_IRUSR: Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
  val S_IRWXG: Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
  val S_IRWXO: Double
  // File Mode Constants
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
  val S_IRWXU: Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
  val S_IWGRP: Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
  val S_IWOTH: Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
  val S_IWUSR: Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
  val S_IXGRP: Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
  val S_IXOTH: Double
  /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
  val S_IXUSR: Double
  /** Constant for fs.access(). File can be written by the calling process. */
  val W_OK: Double
  /** Constant for fs.access(). File can be executed by the calling process. */
  val X_OK: Double
}

object Typeofconstants {
  @scala.inline
  def apply(
    COPYFILE_EXCL: Double,
    COPYFILE_FICLONE: Double,
    COPYFILE_FICLONE_FORCE: Double,
    F_OK: Double,
    O_APPEND: Double,
    O_CREAT: Double,
    O_DIRECT: Double,
    O_DIRECTORY: Double,
    O_DSYNC: Double,
    O_EXCL: Double,
    O_NOATIME: Double,
    O_NOCTTY: Double,
    O_NOFOLLOW: Double,
    O_NONBLOCK: Double,
    O_RDONLY: Double,
    O_RDWR: Double,
    O_SYMLINK: Double,
    O_SYNC: Double,
    O_TRUNC: Double,
    O_WRONLY: Double,
    R_OK: Double,
    S_IFBLK: Double,
    S_IFCHR: Double,
    S_IFDIR: Double,
    S_IFIFO: Double,
    S_IFLNK: Double,
    S_IFMT: Double,
    S_IFREG: Double,
    S_IFSOCK: Double,
    S_IRGRP: Double,
    S_IROTH: Double,
    S_IRUSR: Double,
    S_IRWXG: Double,
    S_IRWXO: Double,
    S_IRWXU: Double,
    S_IWGRP: Double,
    S_IWOTH: Double,
    S_IWUSR: Double,
    S_IXGRP: Double,
    S_IXOTH: Double,
    S_IXUSR: Double,
    W_OK: Double,
    X_OK: Double
  ): Typeofconstants = {
    val __obj = js.Dynamic.literal(COPYFILE_EXCL = COPYFILE_EXCL, COPYFILE_FICLONE = COPYFILE_FICLONE, COPYFILE_FICLONE_FORCE = COPYFILE_FICLONE_FORCE, F_OK = F_OK, O_APPEND = O_APPEND, O_CREAT = O_CREAT, O_DIRECT = O_DIRECT, O_DIRECTORY = O_DIRECTORY, O_DSYNC = O_DSYNC, O_EXCL = O_EXCL, O_NOATIME = O_NOATIME, O_NOCTTY = O_NOCTTY, O_NOFOLLOW = O_NOFOLLOW, O_NONBLOCK = O_NONBLOCK, O_RDONLY = O_RDONLY, O_RDWR = O_RDWR, O_SYMLINK = O_SYMLINK, O_SYNC = O_SYNC, O_TRUNC = O_TRUNC, O_WRONLY = O_WRONLY, R_OK = R_OK, S_IFBLK = S_IFBLK, S_IFCHR = S_IFCHR, S_IFDIR = S_IFDIR, S_IFIFO = S_IFIFO, S_IFLNK = S_IFLNK, S_IFMT = S_IFMT, S_IFREG = S_IFREG, S_IFSOCK = S_IFSOCK, S_IRGRP = S_IRGRP, S_IROTH = S_IROTH, S_IRUSR = S_IRUSR, S_IRWXG = S_IRWXG, S_IRWXO = S_IRWXO, S_IRWXU = S_IRWXU, S_IWGRP = S_IWGRP, S_IWOTH = S_IWOTH, S_IWUSR = S_IWUSR, S_IXGRP = S_IXGRP, S_IXOTH = S_IXOTH, S_IXUSR = S_IXUSR, W_OK = W_OK, X_OK = X_OK)
  
    __obj.asInstanceOf[Typeofconstants]
  }
}

