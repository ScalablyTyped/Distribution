package typings.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object authorizedMod {
  
  type IReactComponent[P] = typings.react.mod.StatelessComponent[P] | (typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState]) | typings.react.mod.ClassicComponentClass[P]
  
  type Secured = js.Function2[
    /* authority */ typings.antDesignPro.authorizedRouteMod.authority, 
    /* error */ js.UndefOr[typings.react.mod.ReactNode], 
    js.Function1[
      /* target */ typings.antDesignPro.authorizedMod.IReactComponent[js.Any], 
      typings.antDesignPro.authorizedMod.IReactComponent[js.Any]
    ]
  ]
  
  type check = js.Function3[
    /* authority */ typings.antDesignPro.authorizedRouteMod.authority, 
    /* target */ typings.antDesignPro.authorizedMod.IReactComponent[js.Any], 
    /* Exception */ typings.antDesignPro.authorizedMod.IReactComponent[js.Any], 
    typings.antDesignPro.authorizedMod.IReactComponent[js.Any]
  ]
}
