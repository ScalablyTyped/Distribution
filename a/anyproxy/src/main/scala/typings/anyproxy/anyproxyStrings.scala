package typings.anyproxy

import typings.anyproxy.mod.NetworkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anyproxyStrings {
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait http
    extends StObject
       with NetworkType
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https
    extends StObject
       with NetworkType
  inline def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait ready extends StObject
  inline def ready: ready = "ready".asInstanceOf[ready]
}
