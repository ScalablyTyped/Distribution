package typings.annyang

import typings.annyang.mod.Events
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object annyangStrings {
  
  @js.native
  sealed trait end
    extends StObject
       with Events
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait error
    extends StObject
       with Events
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait errorNetwork
    extends StObject
       with Events
  inline def errorNetwork: errorNetwork = "errorNetwork".asInstanceOf[errorNetwork]
  
  @js.native
  sealed trait errorPermissionBlocked
    extends StObject
       with Events
  inline def errorPermissionBlocked: errorPermissionBlocked = "errorPermissionBlocked".asInstanceOf[errorPermissionBlocked]
  
  @js.native
  sealed trait errorPermissionDenied
    extends StObject
       with Events
  inline def errorPermissionDenied: errorPermissionDenied = "errorPermissionDenied".asInstanceOf[errorPermissionDenied]
  
  @js.native
  sealed trait result
    extends StObject
       with Events
  inline def result: result = "result".asInstanceOf[result]
  
  @js.native
  sealed trait resultMatch
    extends StObject
       with Events
  inline def resultMatch: resultMatch = "resultMatch".asInstanceOf[resultMatch]
  
  @js.native
  sealed trait resultNoMatch
    extends StObject
       with Events
  inline def resultNoMatch: resultNoMatch = "resultNoMatch".asInstanceOf[resultNoMatch]
  
  @js.native
  sealed trait soundstart
    extends StObject
       with Events
  inline def soundstart: soundstart = "soundstart".asInstanceOf[soundstart]
  
  @js.native
  sealed trait start
    extends StObject
       with Events
  inline def start: start = "start".asInstanceOf[start]
}
