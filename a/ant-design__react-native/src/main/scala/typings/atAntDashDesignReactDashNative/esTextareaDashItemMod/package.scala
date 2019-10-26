package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esTextareaDashItemMod {
  import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.onBlur
  import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.onChange
  import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.onFocus
  import typings.utilityDashTypes.distMappedDashTypesMod.Omit

  type TextInputProps = Omit[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextInputProperties */ js.Any, 
    onChange | onFocus | onBlur
  ]
}
