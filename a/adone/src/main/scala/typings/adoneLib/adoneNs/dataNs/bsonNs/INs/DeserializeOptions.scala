package typings
package adoneLib.adoneNs.dataNs.bsonNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializeOptions extends js.Object {
  /**
    * Return BSON regular expressions as BSONRegExp instances.
    * Default: false
    */
  var bsonRegExp: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Cache evaluated functions for reuse.
    * Default: false
    */
  var cacheFunctions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use a crc32 code for caching, otherwise use the string of the function.
    * Default: false
    */
  var cacheFunctonsCrc32: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Evaluate functions in the BSON document scoped to the object deserialized.
    * Default: false
    */
  var evalFunctions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow to specify if there what fields we wish to return as unserialized raw buffer.
    */
  var fieldsAsRaw: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * When deserializing a Binary will return it as a node.js Buffer instance.
    * Default: false
    */
  var promoteBuffers: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When deserializing a Long will fit it into a Number if it's smaller than 53 bits.
    * Default: true
    */
  var promoteLongs: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When deserializing will promote BSON values to their Node.js closest equivalent types.
    * Default: false
    */
  var promoteValues: js.UndefOr[scala.Boolean] = js.undefined
}

