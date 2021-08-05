package typings.apolloProtobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/minimal", "Enum")
@js.native
class Enum protected ()
  extends typings.apolloProtobufjs.mod.Enum {
  /**
    * Constructs a new enum instance.
    * @param name Unique name within its namespace
    * @param [values] Enum values as an object, by name
    * @param [options] Declared options
    * @param [comment] The comment for this enum
    * @param [comments] The value comments for this enum
    */
  def this(name: String) = this()
  def this(name: String, values: StringDictionary[js.UndefOr[Double]]) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(name: String, values: Unit, options: StringDictionary[js.UndefOr[js.Any]]) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String
  ) = this()
  def this(name: String, values: StringDictionary[js.UndefOr[Double]], options: Unit, comment: String) = this()
  def this(name: String, values: Unit, options: StringDictionary[js.UndefOr[js.Any]], comment: String) = this()
  def this(name: String, values: Unit, options: Unit, comment: String) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: Unit,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: Unit,
    comment: String,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: Unit,
    comment: Unit,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: Unit,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: Unit,
    comment: String,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: Unit,
    options: Unit,
    comment: Unit,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
}
/* static members */
object Enum {
  
  @JSImport("@apollo/protobufjs/minimal", "Enum")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs an enum from an enum descriptor.
    * @param name Enum name
    * @param json Enum descriptor
    * @returns Created enum
    * @throws {TypeError} If arguments are invalid
    */
  inline def fromJSON(name: String, json: IEnum): typings.apolloProtobufjs.mod.Enum = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(name.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.apolloProtobufjs.mod.Enum]
}
