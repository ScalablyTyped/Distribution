package typings
package adoneLib.adoneNs.fsNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirpEntry extends js.Object {
  /**
    * full path to the parent dir
    */
  var fullParentDir: java.lang.String
  /**
    * full path to a file
    */
  var fullPath: java.lang.String
  /**
    * filename
    */
  var name: java.lang.String
  /**
    * relative path to the parent dir
    */
  var parentDir: java.lang.String
  /**
    * relative path to a file
    */
  var path: java.lang.String
  /**
    * file stats
    */
  var stat: Stats
}

