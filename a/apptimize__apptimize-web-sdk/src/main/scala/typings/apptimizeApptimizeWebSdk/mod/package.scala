package typings.apptimizeApptimizeWebSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type callback = js.Function0[scala.Unit]
  
  type simpleData = java.lang.String | scala.Double | scala.Boolean
  
  type unenrollmentCallback = js.Function2[
    /* variantInfo */ typings.apptimizeApptimizeWebSdk.mod.VariantInfo, 
    /* unenrollmentReason */ java.lang.String, 
    scala.Unit
  ]
  
  type variantInfoCallback = js.Function1[/* variantInfo */ typings.apptimizeApptimizeWebSdk.mod.VariantInfo, scala.Unit]
}
