package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait XMLHttpRequestState extends StObject
/**
  * The possible values of the XHR ready state.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
@JSGlobal("XMLHttpRequestState")
@js.native
object XMLHttpRequestState extends StObject {
  
  /**
    * The response is downloaded.
    */
  @js.native
  sealed trait DONE
    extends StObject
       with XMLHttpRequestState
  
  /**
    * The initial part of the request is done, so headers are available.
    */
  @js.native
  sealed trait HEADERS_RECEIVED
    extends StObject
       with XMLHttpRequestState
  
  /**
    * The request is loading and downloading the response.
    */
  @js.native
  sealed trait LOADING
    extends StObject
       with XMLHttpRequestState
  
  /**
    * open() has been called.
    */
  @js.native
  sealed trait OPENED
    extends StObject
       with XMLHttpRequestState
  
  /**
    * The client has been created, but not opened.
    */
  @js.native
  sealed trait UNSENT
    extends StObject
       with XMLHttpRequestState
}
