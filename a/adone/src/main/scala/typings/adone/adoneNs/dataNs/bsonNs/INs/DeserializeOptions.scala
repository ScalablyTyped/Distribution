package typings.adone.adoneNs.dataNs.bsonNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializeOptions extends js.Object {
  /**
    * Return BSON regular expressions as BSONRegExp instances.
    * Default: false
    */
  var bsonRegExp: js.UndefOr[Boolean] = js.undefined
  /**
    * Cache evaluated functions for reuse.
    * Default: false
    */
  var cacheFunctions: js.UndefOr[Boolean] = js.undefined
  /**
    * Use a crc32 code for caching, otherwise use the string of the function.
    * Default: false
    */
  var cacheFunctonsCrc32: js.UndefOr[Boolean] = js.undefined
  /**
    * Evaluate functions in the BSON document scoped to the object deserialized.
    * Default: false
    */
  var evalFunctions: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow to specify if there what fields we wish to return as unserialized raw buffer.
    */
  var fieldsAsRaw: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * When deserializing a Binary will return it as a node.js Buffer instance.
    * Default: false
    */
  var promoteBuffers: js.UndefOr[Boolean] = js.undefined
  /**
    * When deserializing a Long will fit it into a Number if it's smaller than 53 bits.
    * Default: true
    */
  var promoteLongs: js.UndefOr[Boolean] = js.undefined
  /**
    * When deserializing will promote BSON values to their Node.js closest equivalent types.
    * Default: false
    */
  var promoteValues: js.UndefOr[Boolean] = js.undefined
}

object DeserializeOptions {
  @scala.inline
  def apply(
    bsonRegExp: js.UndefOr[Boolean] = js.undefined,
    cacheFunctions: js.UndefOr[Boolean] = js.undefined,
    cacheFunctonsCrc32: js.UndefOr[Boolean] = js.undefined,
    evalFunctions: js.UndefOr[Boolean] = js.undefined,
    fieldsAsRaw: js.Array[String] = null,
    promoteBuffers: js.UndefOr[Boolean] = js.undefined,
    promoteLongs: js.UndefOr[Boolean] = js.undefined,
    promoteValues: js.UndefOr[Boolean] = js.undefined
  ): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bsonRegExp)) __obj.updateDynamic("bsonRegExp")(bsonRegExp)
    if (!js.isUndefined(cacheFunctions)) __obj.updateDynamic("cacheFunctions")(cacheFunctions)
    if (!js.isUndefined(cacheFunctonsCrc32)) __obj.updateDynamic("cacheFunctonsCrc32")(cacheFunctonsCrc32)
    if (!js.isUndefined(evalFunctions)) __obj.updateDynamic("evalFunctions")(evalFunctions)
    if (fieldsAsRaw != null) __obj.updateDynamic("fieldsAsRaw")(fieldsAsRaw)
    if (!js.isUndefined(promoteBuffers)) __obj.updateDynamic("promoteBuffers")(promoteBuffers)
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs)
    if (!js.isUndefined(promoteValues)) __obj.updateDynamic("promoteValues")(promoteValues)
    __obj.asInstanceOf[DeserializeOptions]
  }
}

