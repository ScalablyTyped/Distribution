package typings.awsSdk.browserDefaultMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.converterMod.Converter.ConverterOptions
import typings.awsSdk.documentClientMod.DocumentClient.DocumentClientOptions
import typings.awsSdk.dynamodbMod.AttributeMap
import typings.awsSdk.dynamodbMod.AttributeValue
import typings.awsSdk.dynamodbMod.ClientConfiguration
import typings.awsSdk.dynamodbMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk/clients/browser_default", "DynamoDB")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class DynamoDB () extends ^ {
  def this(options: ClientConfiguration) = this()
}
object DynamoDB {
  
  @JSImport("aws-sdk/clients/browser_default", "DynamoDB.Converter")
  @js.native
  class Converter ()
    extends typings.awsSdk.dynamodbMod.Converter
  /* static members */
  object Converter {
    
    @JSImport("aws-sdk/clients/browser_default", "DynamoDB.Converter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def input(data: js.Any): AttributeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(data.asInstanceOf[js.Any]).asInstanceOf[AttributeValue]
    @scala.inline
    def input(data: js.Any, options: ConverterOptions): AttributeValue = (^.asInstanceOf[js.Dynamic].applyDynamic("input")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AttributeValue]
    
    @scala.inline
    def marshall(data: StringDictionary[js.Any]): AttributeMap = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any]).asInstanceOf[AttributeMap]
    @scala.inline
    def marshall(data: StringDictionary[js.Any], options: ConverterOptions): AttributeMap = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AttributeMap]
    
    @scala.inline
    def output(data: AttributeValue): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("output")(data.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def output(data: AttributeValue, options: ConverterOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("output")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def unmarshall(data: AttributeMap): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshall")(data.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    @scala.inline
    def unmarshall(data: AttributeMap, options: ConverterOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("unmarshall")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  }
  
  @JSImport("aws-sdk/clients/browser_default", "DynamoDB.DocumentClient")
  @js.native
  /**
    * Creates a DynamoDB document client with a set of configuration options.
    */
  class DocumentClient ()
    extends typings.awsSdk.dynamodbMod.DocumentClient {
    def this(options: DocumentClientOptions & ClientConfiguration) = this()
  }
}
