package typings.atApolloReactDashHoc.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @apollo/react-hoc.@apollo/react-hoc/lib/types.DataProps<TData, TGraphQLVariables> ]:? @apollo/react-hoc.@apollo/react-hoc/lib/types.DataProps<TData, TGraphQLVariables>[P]}
- Dropped {[ P in keyof @apollo/react-hoc.@apollo/react-hoc/lib/types.MutateProps<TData, TGraphQLVariables> ]:? @apollo/react-hoc.@apollo/react-hoc/lib/types.MutateProps<TData, TGraphQLVariables>[P]} */ trait OptionProps[TProps, TData, TGraphQLVariables] extends js.Object {
  var ownProps: TProps
}

object OptionProps {
  @scala.inline
  def apply[TProps, TData, TGraphQLVariables](ownProps: TProps): OptionProps[TProps, TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(ownProps = ownProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OptionProps[TProps, TData, TGraphQLVariables]]
  }
}

