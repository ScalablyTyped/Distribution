package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @fileoverview
  * While Angular only uses Trusted Types internally for the time being,
  * references to Trusted Types could leak into our core.d.ts, which would force
  * anyone compiling against @angular/core to provide the @types/trusted-types
  * package in their compilation unit.
  *
  * Until https://github.com/microsoft/TypeScript/issues/30024 is resolved, we
  * will keep Angular's public API surface free of references to Trusted Types.
  * For internal and semi-private APIs that need to reference Trusted Types, the
  * minimal type definitions for the Trusted Types API provided by this module
  * should be used instead. They are marked as "declare" to prevent them from
  * being renamed by compiler optimization.
  *
  * Adapted from
  * https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/trusted-types/index.d.ts
  * but restricted to the API surface used within Angular.
  */
trait TrustedHTML extends StObject {
  
  var __brand__ : "TrustedHTML"
}
object TrustedHTML {
  
  inline def apply(): TrustedHTML = {
    val __obj = js.Dynamic.literal(__brand__ = "TrustedHTML")
    __obj.asInstanceOf[TrustedHTML]
  }
  
  extension [Self <: TrustedHTML](x: Self) {
    
    inline def set__brand__(value: "TrustedHTML"): Self = StObject.set(x, "__brand__", value.asInstanceOf[js.Any])
  }
}
