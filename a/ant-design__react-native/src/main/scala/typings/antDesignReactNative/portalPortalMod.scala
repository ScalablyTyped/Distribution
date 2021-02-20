package typings.antDesignReactNative

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalPortalMod {
  
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
  @JSImport("@ant-design/react-native/lib/portal/portal", JSImport.Default)
  @js.native
  class default () extends Portal
  object default {
    
    @JSImport("@ant-design/react-native/lib/portal/portal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof PortalHost` */
    @JSImport("@ant-design/react-native/lib/portal/portal", "default.Host")
    @js.native
    class Host ()
      extends typings.antDesignReactNative.portalHostMod.default
    /* static members */
    object Host {
      
      @JSImport("@ant-design/react-native/lib/portal/portal", "default.Host")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/portal/portal", "default.Host.displayName")
      @js.native
      def displayName: String = js.native
      @scala.inline
      def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/portal/portal", "default.add")
    @js.native
    def add: js.Function1[/* e */ ReactNode, Double] = js.native
    @scala.inline
    def add_=(x: js.Function1[/* e */ ReactNode, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("add")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/portal/portal", "default.remove")
    @js.native
    def remove: js.Function1[/* key */ Double, Unit] = js.native
    @scala.inline
    def remove_=(x: js.Function1[/* key */ Double, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
  }
  
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
  @js.native
  trait Portal
    extends Component[PortalProps, js.Object, js.Any]
  object Portal {
    
    /* was `typeof PortalHost` */
    type Host = typings.antDesignReactNative.portalHostMod.default
  }
  
  @js.native
  trait PortalProps extends StObject {
    
    /**
      * Content of the `Portal`.
      */
    var children: js.UndefOr[ReactNode] = js.native
  }
  object PortalProps {
    
    @scala.inline
    def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit class PortalPropsMutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
