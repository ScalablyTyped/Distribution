package typings.awsDashSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashSdk.libDynamodbConverterMod.ConverterNs.ConverterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/dynamodb", "Converter")
@js.native
class Converter ()
  extends typings.awsDashSdk.libDynamodbConverterMod.Converter

/* static members */
@JSImport("aws-sdk/clients/dynamodb", "Converter")
@js.native
object Converter extends js.Object {
  def input(data: js.Any): AttributeValue = js.native
  def input(data: js.Any, options: ConverterOptions): AttributeValue = js.native
  def marshall(data: StringDictionary[js.Any]): AttributeMap = js.native
  def marshall(data: StringDictionary[js.Any], options: ConverterOptions): AttributeMap = js.native
  def output(data: AttributeValue): js.Any = js.native
  def output(data: AttributeValue, options: ConverterOptions): js.Any = js.native
  def unmarshall(data: AttributeMap): StringDictionary[js.Any] = js.native
  def unmarshall(data: AttributeMap, options: ConverterOptions): StringDictionary[js.Any] = js.native
}

