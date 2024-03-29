package typings.allureJsCommons

import typings.allureJsCommons.mod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object allureJsCommonsStrings {
  
  @js.native
  sealed trait broken
    extends StObject
       with Status
  inline def broken: broken = "broken".asInstanceOf[broken]
  
  @js.native
  sealed trait failed
    extends StObject
       with Status
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait passed
    extends StObject
       with Status
  inline def passed: passed = "passed".asInstanceOf[passed]
  
  @js.native
  sealed trait pending
    extends StObject
       with Status
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait skipped
    extends StObject
       with Status
  inline def skipped: skipped = "skipped".asInstanceOf[skipped]
}
