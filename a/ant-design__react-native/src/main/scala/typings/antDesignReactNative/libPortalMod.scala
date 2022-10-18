package typings.antDesignReactNative

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPortalMod {
  
  /**
    * Portal allows to render a component at a different place in the parent tree.
    * You can use it to render content which should appear above other elements, similar to `Modal`.
    * It requires a [`Portal.Host`](portal-host.html) component to be rendered somewhere in the parent tree.
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { Portal, Text } from '@ant-design/react-native';
    *
    * export default class MyComponent extends React.Component {
    *   render() {
    *     const { visible } = this.state;
    *     return (
    *       <Portal>
    *         <Text>This is rendered at a different place</Text>
    *       </Portal>
    *     );
    *   }
    * }
    * ```
    */
  @JSImport("@ant-design/react-native/lib/portal", JSImport.Default)
  @js.native
  open class default ()
    extends typings.antDesignReactNative.libPortalPortalMod.default
  object default {
    
    @JSImport("@ant-design/react-native/lib/portal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof PortalHost` */
    @JSImport("@ant-design/react-native/lib/portal", "default.Host")
    @js.native
    open class Host ()
      extends typings.antDesignReactNative.libPortalPortalMod.default.Host
    /* static members */
    object Host {
      
      @JSImport("@ant-design/react-native/lib/portal", "default.Host")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/portal", "default.Host.displayName")
      @js.native
      def displayName: String = js.native
      inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/portal", "default.add")
    @js.native
    def add: js.Function1[/* e */ ReactNode, Double] = js.native
    inline def add_=(x: js.Function1[/* e */ ReactNode, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("add")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/portal", "default.remove")
    @js.native
    def remove: js.Function1[/* key */ Double, Unit] = js.native
    inline def remove_=(x: js.Function1[/* key */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
  }
}
