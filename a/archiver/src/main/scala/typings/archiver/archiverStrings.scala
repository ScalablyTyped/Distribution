package typings.archiver

import typings.archiver.mod.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object archiverStrings {
  
  @js.native
  sealed trait Partial extends StObject
  inline def Partial: Partial = "Partial".asInstanceOf[Partial]
  
  @js.native
  sealed trait close extends StObject
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait data extends StObject
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait drain extends StObject
  inline def drain: drain = "drain".asInstanceOf[drain]
  
  @js.native
  sealed trait entry extends StObject
  inline def entry: entry = "entry".asInstanceOf[entry]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait finish extends StObject
  inline def finish: finish = "finish".asInstanceOf[finish]
  
  @js.native
  sealed trait pipe extends StObject
  inline def pipe: pipe = "pipe".asInstanceOf[pipe]
  
  @js.native
  sealed trait progress extends StObject
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait tar
    extends StObject
       with Format
  inline def tar: tar = "tar".asInstanceOf[tar]
  
  @js.native
  sealed trait unpipe extends StObject
  inline def unpipe: unpipe = "unpipe".asInstanceOf[unpipe]
  
  @js.native
  sealed trait warning extends StObject
  inline def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait zip
    extends StObject
       with Format
  inline def zip: zip = "zip".asInstanceOf[zip]
}
