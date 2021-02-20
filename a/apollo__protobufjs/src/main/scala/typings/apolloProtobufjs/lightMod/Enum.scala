package typings.apolloProtobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/light", "Enum")
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
  def this(name: String, values: js.UndefOr[scala.Nothing], options: StringDictionary[js.UndefOr[js.Any]]) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: StringDictionary[js.UndefOr[js.Any]]
  ) = this()
  def this(
    name: String,
    values: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    comment: String
  ) = this()
  def this(
    name: String,
    values: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String
  ) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: js.UndefOr[scala.Nothing],
    comment: String
  ) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String
  ) = this()
  def this(
    name: String,
    values: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    comment: js.UndefOr[scala.Nothing],
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    comment: String,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: js.UndefOr[scala.Nothing],
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: js.UndefOr[scala.Nothing],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: js.UndefOr[scala.Nothing],
    comment: js.UndefOr[scala.Nothing],
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: js.UndefOr[scala.Nothing],
    comment: String,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: js.UndefOr[scala.Nothing],
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
  def this(
    name: String,
    values: StringDictionary[js.UndefOr[Double]],
    options: StringDictionary[js.UndefOr[js.Any]],
    comment: String,
    comments: StringDictionary[js.UndefOr[String]]
  ) = this()
}
/* static members */
object Enum {
  
  /**
    * Constructs an enum from an enum descriptor.
    * @param name Enum name
    * @param json Enum descriptor
    * @returns Created enum
    * @throws {TypeError} If arguments are invalid
    */
  @JSImport("@apollo/protobufjs/light", "Enum.fromJSON")
  @js.native
  def fromJSON(name: String, json: IEnum): typings.apolloProtobufjs.mod.Enum = js.native
}
