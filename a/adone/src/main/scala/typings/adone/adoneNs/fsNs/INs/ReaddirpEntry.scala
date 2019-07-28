package typings.adone.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirpEntry extends js.Object {
  /**
    * full path to the parent dir
    */
  var fullParentDir: String
  /**
    * full path to a file
    */
  var fullPath: String
  /**
    * filename
    */
  var name: String
  /**
    * relative path to the parent dir
    */
  var parentDir: String
  /**
    * relative path to a file
    */
  var path: String
  /**
    * file stats
    */
  var stat: Stats
}

object ReaddirpEntry {
  @scala.inline
  def apply(
    fullParentDir: String,
    fullPath: String,
    name: String,
    parentDir: String,
    path: String,
    stat: Stats
  ): ReaddirpEntry = {
    val __obj = js.Dynamic.literal(fullParentDir = fullParentDir, fullPath = fullPath, name = name, parentDir = parentDir, path = path, stat = stat)
  
    __obj.asInstanceOf[ReaddirpEntry]
  }
}

