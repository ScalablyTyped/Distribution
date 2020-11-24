package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "Trace")
@js.native
/**
  * Constructs a new Trace.
  * @param [properties] Properties to set
  */
class Trace_ () extends ITrace {
  def this(properties: ITrace) = this()
  
  /** Trace clientAddress. */
  @JSName("clientAddress")
  var clientAddress_Trace_ : String = js.native
  
  /** Trace clientName. */
  @JSName("clientName")
  var clientName_Trace_ : String = js.native
  
  /** Trace clientReferenceId. */
  @JSName("clientReferenceId")
  var clientReferenceId_Trace_ : String = js.native
  
  /** Trace clientVersion. */
  @JSName("clientVersion")
  var clientVersion_Trace_ : String = js.native
  
  /** Trace durationNs. */
  @JSName("durationNs")
  var durationNs_Trace_ : Double = js.native
  
  /** Trace forbiddenOperation. */
  @JSName("forbiddenOperation")
  var forbiddenOperation_Trace_ : Boolean = js.native
  
  /** Trace fullQueryCacheHit. */
  @JSName("fullQueryCacheHit")
  var fullQueryCacheHit_Trace_ : Boolean = js.native
  
  /** Trace legacySignatureNeedsResigning. */
  @JSName("legacySignatureNeedsResigning")
  var legacySignatureNeedsResigning_Trace_ : String = js.native
  
  /** Trace persistedQueryHit. */
  @JSName("persistedQueryHit")
  var persistedQueryHit_Trace_ : Boolean = js.native
  
  /** Trace persistedQueryRegister. */
  @JSName("persistedQueryRegister")
  var persistedQueryRegister_Trace_ : Boolean = js.native
  
  /** Trace registeredOperation. */
  @JSName("registeredOperation")
  var registeredOperation_Trace_ : Boolean = js.native
  
  /** Trace signature. */
  @JSName("signature")
  var signature_Trace_ : String = js.native
  
  /**
    * Converts this Trace to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** Trace unexecutedOperationBody. */
  @JSName("unexecutedOperationBody")
  var unexecutedOperationBody_Trace_ : String = js.native
  
  /** Trace unexecutedOperationName. */
  @JSName("unexecutedOperationName")
  var unexecutedOperationName_Trace_ : String = js.native
}
